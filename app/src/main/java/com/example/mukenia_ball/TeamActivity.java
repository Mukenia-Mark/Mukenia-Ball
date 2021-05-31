package com.example.mukenia_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TeamActivity extends AppCompatActivity {
  @BindView(R.id.teamTextView) TextView mTeamTextView;
  @BindView(R.id.teamListView) ListView mTeamListView;
  private String[] teams = new String[] {
      "A.C Milan","Arsenal","Athletico Madrid","Barcelona","Bayern Munich","Borussia Dortmund",
      "Chelsea","Inter Milan","Juventus","Lille OSC","Liverpool","Manchester City","Manchester United","Monaco","Paris Saint Germain",
      "Real Madrid","Red Bull Leipzig","Tottenham Hotspur"};
  private String[] leagues = new String[] {
      "","","","","","","","","","","","","","","","","",""};

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_team);
    ButterKnife.bind(this);
    TeamArrayAdapter adapter = new TeamArrayAdapter(this, android.R.layout.simple_list_item_1, teams, leagues);
    mTeamListView.setAdapter(adapter);
    mTeamListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String team = ((TextView)view).getText().toString();
        Log.v("TeamActivity", "In the onItemClickListener!");
        Toast.makeText(TeamActivity.this, team, Toast.LENGTH_LONG).show();
      }
    });
    Intent intent = getIntent();
    String team = intent.getStringExtra("team");
    mTeamTextView.setText("Here are all the teams with the name " + team);
    Log.d("TeamActivity", "In the onCreate method!");
  }
}