package com.example.mukenia_ball;

import android.content.Intent;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadow.api.Shadow;
import org.robolectric.shadows.ShadowActivity;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
  private MainActivity activity;

  @Before
  public void setUp() throws Exception {
    activity = Robolectric.buildActivity(MainActivity.class)
        .create()
        .resume()
        .get();
  }
  @Test
  public void validateTextViewContent() {
    TextView mukeniaBallTextView = activity.findViewById(R.id.mukeniaBallTextView);
    assertTrue("Welcome to Mukenia Ball".equals(mukeniaBallTextView.getText().toString()));
  }
  @Test
  public void secondActivityStarted() {
    activity.findViewById(R.id.findTeamButton).performClick();
    Intent expectedIntent = new Intent(activity, TeamActivity.class);
    ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
    Intent actualIntent = shadowActivity.getNextStartedActivity();
    assertTrue(actualIntent.filterEquals(expectedIntent));
  }

}
