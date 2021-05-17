package com.example.mukenia_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TeamActivity extends AppCompatActivity {
    private TextView mTeamTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        mTeamTextView = (TextView) findViewById(R.id.teamTextView);
        Intent intent = getIntent();
        String team = intent.getStringExtra("team");
        mTeamTextView.setText("Here are all the teams with the name " + team);
    }
}