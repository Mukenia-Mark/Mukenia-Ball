package com.example.mukenia_ball;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TeamMenuActivity extends AppCompatActivity {
  private static final String TAG = PlayerMenuActivity.class.getSimpleName();
  @BindView(R.id.teamErrorTextView)
  TextView mTeamErrorTextView;
  @BindView(R.id.teamProgressBar)
  ProgressBar mTeamProgressBar;
  @BindView(R.id.teamList)
  ListView mTeamList;
  @BindView(R.id.teamTitle)
  TextView mTeamTitle;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_teammenu);
    ButterKnife.bind(this);

    mTeamList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String team = ((TextView) view).getText().toString();
        Toast.makeText(TeamMenuActivity.this, team, Toast.LENGTH_LONG).show();
      }
    });
    Intent intent = getIntent();
    String team = intent.getStringExtra("team");
    mTeamTitle.setText(team);


    TeamApi client = TeamClient.getClient();
    Call<MukeniaBallTeamResponses> call = client.getTeams(team);

    call.enqueue(new Callback<MukeniaBallTeamResponses>() {
      @Override
      public void onResponse(Call<MukeniaBallTeamResponses> call, Response<MukeniaBallTeamResponses> response) {
        hideProgressBar();
        if (response.isSuccessful()) {
          List<Team> teamList = response.body().getTeams();
          String[] team = new String[teamList.size()];

          for (int i = 0; i < team.length; i++) {
            team[i] = teamList.get(i).getStrTeam();
          }
          ArrayAdapter adapter
              = new PlayerArrayAdapter(TeamMenuActivity.this, android.R.layout.simple_list_item_1, team);
          mTeamList.setAdapter(adapter);
          showTeams();
        } else {
          showUnsuccessfulMessage();
        }
      }

      @Override
      public void onFailure(Call<MukeniaBallTeamResponses> call, Throwable t) {
        Log.e(TAG,"onFailure",t);
        hideProgressBar();
        showFailureMessage();
      }
    });
  }

  private void showFailureMessage() {
    mTeamErrorTextView.setText("Something went Wrong. Please Check your Internet connection and try again later");
    mTeamErrorTextView.setVisibility(View.VISIBLE);
  }

  private void showUnsuccessfulMessage() {
    mTeamErrorTextView.setText("Something went wrong. Please try again later");
    mTeamErrorTextView.setVisibility(View.VISIBLE);
  }

  private void showTeams() {
    mTeamList.setVisibility(View.VISIBLE);
  }

  private void hideProgressBar() {
    mTeamProgressBar.setVisibility(View.GONE);
  }
}
