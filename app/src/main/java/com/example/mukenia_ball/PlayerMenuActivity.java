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

public class PlayerMenuActivity extends AppCompatActivity {
  @BindView(R.id.playerList) ListView mPlayerList;
  @BindView(R.id.playerMenuTitle) TextView mPlayerMenuTitle;
  private String[] people = new String[] {"Sergio Ramos","Cristiano Ronaldo","Lionel Messi"};

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_playermenu);
    ButterKnife.bind(this);

    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, people);
    mPlayerList.setAdapter(adapter);
    mPlayerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String person = ((TextView)view).getText().toString();
        Toast.makeText(PlayerMenuActivity.this, person,Toast.LENGTH_LONG).show();
      }
    });
    Intent intent = getIntent();
    String person = intent.getStringExtra("person");
    mPlayerMenuTitle.setText(person);
  }
}
