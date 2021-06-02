package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity {
  public static final String TAG = LogInActivity.class.getSimpleName();
  private Button mlogInConfirmButton;
  private EditText mEditTextLoginUserName;
  private EditText mEditTextLoginPassword;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

    mEditTextLoginUserName = (EditText) findViewById(R.id.editTextLoginUserName);
    mEditTextLoginPassword = (EditText) findViewById(R.id.editTextLoginPassword);
    mlogInConfirmButton = (Button) findViewById(R.id.logInConfirmButton);
    mlogInConfirmButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(LogInActivity.this, SearchActivity.class);
        startActivity(intent);
      }
    });
  }
}
