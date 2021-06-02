package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
  public static final String TAG = SignUpActivity.class.getSimpleName();
  private Button mSignUpConfirmButton;
  private EditText mEditTextSignUpUserName;
  private EditText mEditTextSignUpEmail;
  private EditText mEditTextSignUpPassword;
  private EditText meEditTextSignUpReEnterPassword;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_signup);

    mEditTextSignUpUserName = (EditText) findViewById(R.id.editTextSignUpUserName);
    mEditTextSignUpEmail = (EditText) findViewById(R.id.editTextSignUpEmail);
    mEditTextSignUpPassword = (EditText) findViewById(R.id.editTextSignUpPassword);
    meEditTextSignUpReEnterPassword = (EditText) findViewById(R.id.editTextSignUpReEnterPassword);
    mSignUpConfirmButton = (Button) findViewById(R.id.signUpConfirmButton);
    mSignUpConfirmButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(SignUpActivity.this, SearchActivity.class);
        startActivity(intent);
      }
    });
  }
}
