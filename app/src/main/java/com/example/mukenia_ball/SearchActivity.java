package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {
  private Button mTeamSearchButton;
  private Button mPlayerAndCoachSearchButton;
  private Button mLeagueSearchButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search);

    mTeamSearchButton = (Button) findViewById(R.id.teamSearchButton);
    mTeamSearchButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(SearchActivity.this, TeamSearchActivity.class);
        startActivity(intent);
      }
    });
    mPlayerAndCoachSearchButton = (Button) findViewById(R.id.playerAndCoachSearchButton);
    mPlayerAndCoachSearchButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(SearchActivity.this, PlayerAndCoachSearchActivity.class);
        startActivity(intent);
      }
    });
    mLeagueSearchButton = (Button) findViewById(R.id.leagueSearchButton);
    mLeagueSearchButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(SearchActivity.this, LeagueSearchActivity.class);
        startActivity(intent);
      }
    });
  }
}
