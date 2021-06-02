package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayerMenuActivity extends AppCompatActivity {
  private TextView mPlayerMenuTitle;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_playermenu);
    mPlayerMenuTitle = (TextView) findViewById(R.id.playerMenuTitle);
    Intent intent = getIntent();
    String person = intent.getStringExtra("person");
    mPlayerMenuTitle.setText(person);
  }
}
