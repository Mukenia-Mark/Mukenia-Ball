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

public class PlayerAndCoachSearchActivity extends AppCompatActivity {
  public static final String TAG = LogInActivity.class.getSimpleName();
  @BindView(R.id.findPlayerOrCoachButton) Button mFindPlayerOrCoachButton;
  @BindView(R.id.playerAndCoachSearchBar) EditText mPlayerAndCoachSearchBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_playerandcoachsearch);
    ButterKnife.bind(this);

    mFindPlayerOrCoachButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String person = mPlayerAndCoachSearchBar.getText().toString();
        Intent intent = new Intent(PlayerAndCoachSearchActivity.this, PlayerMenuActivity.class);
        intent.putExtra("person", person);
        startActivity(intent);
      }
    });
  }
}
