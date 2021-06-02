package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends AppCompatActivity {
  public static final String TAG = SignUpActivity.class.getSimpleName();
  @BindView(R.id.signUpConfirmButton) Button mSignUpConfirmButton;
  @BindView(R.id.editTextSignUpUserName) EditText mEditTextSignUpUserName;
  @BindView(R.id.editTextSignUpEmail) EditText mEditTextSignUpEmail;
  @BindView(R.id.editTextSignUpPassword) EditText mEditTextSignUpPassword;
  @BindView(R.id.editTextSignUpReEnterPassword) EditText meEditTextSignUpReEnterPassword;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_signup);
    ButterKnife.bind(this);

    mSignUpConfirmButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(SignUpActivity.this, SearchActivity.class);
        startActivity(intent);
      }
    });
  }
}
