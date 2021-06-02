package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class LeagueMenuActivity extends AppCompatActivity {
  private TextView mLeagueTitle;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_leaguemenu);
    mLeagueTitle = (TextView) findViewById(R.id.leagueTitle);
    Intent intent = getIntent();
    String league = intent.getStringExtra("league");
    mLeagueTitle.setText(league);
  }
}
