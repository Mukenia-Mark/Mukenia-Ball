package com.example.mukenia_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
  @BindView(R.id.findTeamButton) Button mFindTeamButton;
  @BindView(R.id.teamEditText) EditText mTeamEditText;
  @BindView(R.id.mukeniaBallTextView) TextView mMukeniaBallTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    mFindTeamButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String team = mTeamEditText.getText().toString();
        Intent intent = new Intent(MainActivity.this, TeamActivity.class);
        intent.putExtra("team", team);
        startActivity(intent);
      }
    });
  }
}