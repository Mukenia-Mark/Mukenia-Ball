package com.example.mukenia_ball;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TeamSearchActivity extends AppCompatActivity {
  public static final String TAG = LogInActivity.class.getSimpleName();
  private Button mFindTeamButton;
  private EditText mTeamSearchBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_teamsearch);

    mTeamSearchBar = (EditText) findViewById(R.id.teamSearchBar);
    mFindTeamButton = (Button) findViewById(R.id.findTeamButton);
    mFindTeamButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String team = mTeamSearchBar.getText().toString();
        Toast.makeText(TeamSearchActivity.this, team, Toast.LENGTH_LONG).show();
      }
    });
  }
}
