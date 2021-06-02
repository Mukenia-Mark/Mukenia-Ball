package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LeagueSearchActivity extends AppCompatActivity {
  public static final String TAG = LogInActivity.class.getSimpleName();
  @BindView(R.id.findLeagueButton) Button mFindLeagueButton;
  @BindView(R.id.leagueSearchBar) EditText mLeagueSearchBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_leaguesearch);
    ButterKnife.bind(this);

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
