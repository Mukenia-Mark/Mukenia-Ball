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

public class PlayerMenuActivity extends AppCompatActivity {
  private static final String TAG = PlayerMenuActivity.class.getSimpleName();
  @BindView(R.id.playerErrorTextView)
  TextView mPlayerErrorTextView;
  @BindView(R.id.playerProgressBar)
  ProgressBar mPlayerProgressBar;
  @BindView(R.id.playerList)
  ListView mPlayerList;
  @BindView(R.id.playerMenuTitle)
  TextView mPlayerMenuTitle;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_playermenu);
    ButterKnife.bind(this);

    mPlayerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String person = ((TextView) view).getText().toString();
        Toast.makeText(PlayerMenuActivity.this, person, Toast.LENGTH_LONG).show();
      }
    });
    Intent intent = getIntent();
    String person = intent.getStringExtra("person");
    mPlayerMenuTitle.setText(person);


    PlayerApi client = PlayerClient.getClient();
    Call<MukeniaBallPlayerResponses> call = client.getPlayers(person);

    call.enqueue(new Callback<MukeniaBallPlayerResponses>() {
      @Override
      public void onResponse(Call<MukeniaBallPlayerResponses> call, Response<MukeniaBallPlayerResponses> response) {
        hideProgressBar();
        if (response.isSuccessful()) {
          List<Player> playerList = response.body().getPlayer();
          String[] person = new String[playerList.size()];

          for (int i = 0; i < person.length; i++) {
            person[i] = playerList.get(i).getStrPlayer();
          }
          ArrayAdapter adapter
              = new PlayerArrayAdapter(PlayerMenuActivity.this, android.R.layout.simple_list_item_1, person);
          mPlayerList.setAdapter(adapter);
          showPlayers();
        } else {
          showUnsuccessfulMessage();
        }
      }

      @Override
      public void onFailure(Call<MukeniaBallPlayerResponses> call, Throwable t) {
        Log.e(TAG,"onFailure",t);
        hideProgressBar();
        showFailureMessage();
      }
    });
  }

  private void showFailureMessage() {
    mPlayerErrorTextView.setText("Something went Wrong. Please Check your Internet connection and try again later");
    mPlayerErrorTextView.setVisibility(View.VISIBLE);
  }

  private void showUnsuccessfulMessage() {
    mPlayerErrorTextView.setText("Something went wrong. Please try again later");
    mPlayerErrorTextView.setVisibility(View.VISIBLE);
  }

  private void showPlayers() {
    mPlayerList.setVisibility(View.VISIBLE);
  }

  private void hideProgressBar() {
    mPlayerProgressBar.setVisibility(View.GONE);
  }
}