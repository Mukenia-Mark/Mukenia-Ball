package com.example.mukenia_ball;

import android.view.View;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.not;

@RunWith(AndroidJUnit4.class)
public class TeamActivityInstrumentationTest {
  private View activityDecorView;

  @Rule
  public ActivityScenarioRule<TeamActivity> activityTestRule =
    new ActivityScenarioRule<>(TeamActivity.class);

  @Before
  public void setUp() {
    activityTestRule.getScenario().onActivity(new ActivityScenario.ActivityAction<TeamActivity>() {
      @Override
      public void perform(TeamActivity activity) {
        activityDecorView = activity.getWindow().getDecorView();
      }
    });
  }

  @Test
  public void listItemClickDisplaysToastWithCorrectTeamName() {
    String teamName = "A.C Milan";
    onData(anything())
        .inAdapterView(withId(R.id.teamListView))
        .atPosition(0)
        .perform(click());
    onData(withText(teamName)).inRoot(withDecorView(not(activityDecorView)))
        .check(matches(withText(teamName)));
  }

}
