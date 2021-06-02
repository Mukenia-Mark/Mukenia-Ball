package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TeamMenuActivity extends AppCompatActivity {
  @BindView (R.id.teamTitle) TextView mTeamTitle;
  @BindView (R.id.teamList) ListView mTeamList;
  private String[] teams = new String[] {"Manchester United", "Real Madrid", "Juventus"};

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_teammenu);
    ButterKnife.bind(this);

    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, teams);
    mTeamList.setAdapter(adapter);
    mTeamList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String team = ((TextView)view).getText().toString();
        Toast.makeText(TeamMenuActivity.this, team,Toast.LENGTH_LONG).show();
      }
    });
    Intent intent = getIntent();
    String team = intent.getStringExtra("team");
    mTeamTitle.setText(team);
  }
}
