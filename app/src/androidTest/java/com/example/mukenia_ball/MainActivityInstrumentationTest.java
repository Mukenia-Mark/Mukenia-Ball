package com.example.mukenia_ball;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {

  @Rule
  public ActivityScenarioRule<MainActivity> activityRule =
      new ActivityScenarioRule<>(MainActivity.class);
  @Test
  public void validateEditText() {
    onView(withId(R.id.teamEditText)).perform(typeText("Manchester"))
        .check(matches(withText("Manchester")));
  }
  @Test
  public void teamIsSentToTeamsActivity() {
    String team = "Manchester";
    onView(withId(R.id.teamEditText)).perform(typeText(team)).perform(closeSoftKeyboard());
    try {
      Thread.sleep(250);
    } catch (InterruptedException e) {
      System.out.println("got interrupted!");
    }
    onView(withId(R.id.findTeamButton)).perform(click());
    onView(withId(R.id.teamTextView)).check(matches(withText("Here are all the teams with the name " + team)));
  }
}
