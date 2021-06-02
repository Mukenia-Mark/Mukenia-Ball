package com.example.mukenia_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
  @BindView(R.id.signUpButton) Button mSignUpButton;
  @BindView(R.id.getStartedButton) Button mGetStartedButton;
  @BindView(R.id.logInButton) Button mLogInButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    mSignUpButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(intent);
      }
    });

    mGetStartedButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(intent);
      }
    });

    mLogInButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, LogInActivity.class);
        startActivity(intent);
      }
    });
  }
}