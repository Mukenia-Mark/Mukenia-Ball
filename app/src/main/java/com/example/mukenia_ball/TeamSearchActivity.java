package com.example.mukenia_ball;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TeamSearchActivity extends AppCompatActivity {
  private Button mFIndTeamButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_teamsearch);

    mFIndTeamButton = (Button) findViewById(R.id.findTeamButton);
    mFIndTeamButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(TeamSearchActivity.this, "Search for Team", Toast.LENGTH_LONG).show();
      }
    });
  }
}
