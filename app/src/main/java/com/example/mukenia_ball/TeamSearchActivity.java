package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TeamSearchActivity extends AppCompatActivity {
  public static final String TAG = LogInActivity.class.getSimpleName();
  @BindView(R.id.findTeamButton) Button mFindTeamButton;
  @BindView(R.id.teamSearchBar) EditText mTeamSearchBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_teamsearch);
    ButterKnife.bind(this);

    mFindTeamButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String team = mTeamSearchBar.getText().toString();
        Intent intent = new Intent(TeamSearchActivity.this, TeamMenuActivity.class);
        intent.putExtra("team", team);
        startActivity(intent);
      }
    });
  }
}
