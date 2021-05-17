package com.example.mukenia_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class TeamActivity extends AppCompatActivity {
  private TextView mTeamTextView;
  private ListView mTeamListView;
  private String[] teams = new String[] {
      "A.C Milan","Arsenal","Athletico Madrid","Barcelona","Bayern Munich","Borussia Dortmund",
      "Chelsea","Inter Milan","Juventus","Liverpool","Manchester City","Manchester United","Paris Saint Germain",
      "Real Madrid", "Tottenham Hotspur"};

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_team);
    mTeamListView = (ListView) findViewById(R.id.teamListView);
    mTeamTextView = (TextView) findViewById(R.id.teamTextView);
    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, teams);
    mTeamListView.setAdapter(adapter);
    mTeamListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String team = ((TextView)view).getText().toString();
        Toast.makeText(TeamActivity.this, team, Toast.LENGTH_LONG).show();
      }
    });
    Intent intent = getIntent();
    String team = intent.getStringExtra("team");
    mTeamTextView.setText("Here are all the teams with the name " + team);
  }
}