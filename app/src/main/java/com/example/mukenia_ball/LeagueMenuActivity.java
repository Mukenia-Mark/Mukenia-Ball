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

public class LeagueMenuActivity extends AppCompatActivity {
  @BindView(R.id.leagueTitle) TextView mLeagueTitle;
  @BindView(R.id.leagueList) ListView mLeagueList;
  private String[] leagues = new String[] {"English Premier League", "Serie A", "La Liga"};

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_leaguemenu);
    ButterKnife.bind(this);

    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, leagues);
    mLeagueList.setAdapter(adapter);
    mLeagueList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String league = ((TextView)view).getText().toString();
        Toast.makeText(LeagueMenuActivity.this, league,Toast.LENGTH_LONG).show();
      }
    });
    Intent intent = getIntent();
    String league = intent.getStringExtra("league");
    mLeagueTitle.setText(league);
  }
}
