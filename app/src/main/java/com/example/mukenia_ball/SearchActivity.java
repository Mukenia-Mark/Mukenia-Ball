package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity {
  @BindView(R.id.teamSearchButton) Button mTeamSearchButton;
  @BindView(R.id.playerAndCoachSearchButton) Button mPlayerAndCoachSearchButton;
  @BindView(R.id.leagueSearchButton) Button mLeagueSearchButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search);
    ButterKnife.bind(this);

    mTeamSearchButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(SearchActivity.this, TeamSearchActivity.class);
        startActivity(intent);
      }
    });
    mPlayerAndCoachSearchButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(SearchActivity.this, PlayerAndCoachSearchActivity.class);
        startActivity(intent);
      }
    });
    mLeagueSearchButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(SearchActivity.this, LeagueSearchActivity.class);
        startActivity(intent);
      }
    });
  }
}
