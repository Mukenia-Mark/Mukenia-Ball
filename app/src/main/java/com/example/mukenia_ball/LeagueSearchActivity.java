package com.example.mukenia_ball;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LeagueSearchActivity extends AppCompatActivity {
  private Button mFindLeagueButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_leaguesearch);

    mFindLeagueButton = (Button) findViewById(R.id.findLeagueButton);
    mFindLeagueButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(LeagueSearchActivity.this, "Search for League", Toast.LENGTH_LONG).show();
      }
    });
  }
}
