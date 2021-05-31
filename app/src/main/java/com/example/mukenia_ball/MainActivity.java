package com.example.mukenia_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
  private Button mSignUpButton;
  private Button mGetStartedButton;
  private Button mLogInButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mSignUpButton = (Button) findViewById(R.id.signUpButton);
    mSignUpButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(MainActivity.this, "Sign Up", Toast.LENGTH_LONG).show();
      }
    });
    mGetStartedButton = (Button) findViewById(R.id.getStartedButton);
    mGetStartedButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(MainActivity.this, "Sign Up", Toast.LENGTH_LONG).show();
      }
    });
    mLogInButton = (Button) findViewById(R.id.logInButton);
    mLogInButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(MainActivity.this, "Log In", Toast.LENGTH_LONG).show();
      }
    });
  }
}