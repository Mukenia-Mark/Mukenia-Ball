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

public class LogInActivity extends AppCompatActivity {
  public static final String TAG = LogInActivity.class.getSimpleName();
  @BindView(R.id.logInConfirmButton) Button mLogInConfirmButton;
  @BindView(R.id.editTextLoginUserName) EditText mEditTextLoginUserName;
  @BindView(R.id.editTextLoginPassword) EditText mEditTextLoginPassword;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    ButterKnife.bind(this);

    mLogInConfirmButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(LogInActivity.this, SearchActivity.class);
        startActivity(intent);
      }
    });
  }
}
