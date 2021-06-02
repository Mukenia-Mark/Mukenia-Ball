package com.example.mukenia_ball;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PlayerAndCoachSearchActivity extends AppCompatActivity {
  private Button mFindPlayerOrCoachButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_playerandcoachsearch);

    mFindPlayerOrCoachButton = (Button) findViewById(R.id.findPlayerOrCoachButton);
    mFindPlayerOrCoachButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(PlayerAndCoachSearchActivity.this, "Search for Player or Coach", Toast.LENGTH_LONG).show();
      }
    });
  }
}
