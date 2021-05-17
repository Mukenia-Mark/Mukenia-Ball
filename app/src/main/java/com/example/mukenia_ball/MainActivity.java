package com.example.mukenia_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mFindTeamButton;
    private EditText mTeamEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTeamEditText = (EditText) findViewById(R.id.teamEditText);
        mFindTeamButton = (Button)findViewById(R.id.findTeamButton);
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