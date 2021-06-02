package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TeamMenuActivity extends AppCompatActivity {
  private TextView mTeamTitle;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_teammenu);
    mTeamTitle = (TextView) findViewById(R.id.teamTitle);
    Intent intent = getIntent();
    String team = intent.getStringExtra("team");
    mTeamTitle.setText(team);
  }
}
