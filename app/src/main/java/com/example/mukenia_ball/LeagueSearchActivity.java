package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LeagueSearchActivity extends AppCompatActivity {
  public static final String TAG = LogInActivity.class.getSimpleName();
  private Button mFindLeagueButton;
  private EditText mLeagueSearchBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_leaguesearch);

    mLeagueSearchBar = (EditText) findViewById(R.id.leagueSearchBar);
    mFindLeagueButton = (Button) findViewById(R.id.findLeagueButton);
    mFindLeagueButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String league = mLeagueSearchBar.getText().toString();
        Intent intent = new Intent(LeagueSearchActivity.this, LeagueMenuActivity.class);
        intent.putExtra("league", league);
        startActivity(intent);
      }
    });
  }
}
