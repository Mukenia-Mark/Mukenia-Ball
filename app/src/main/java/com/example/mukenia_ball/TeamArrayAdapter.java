package com.example.mukenia_ball;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;

public class TeamArrayAdapter extends ArrayAdapter {
  private Context mContext;
  private String[] mTeams;
  private String[] mLeagues;

  public TeamArrayAdapter(Context mContext, int resource, String[] mTeams, String[] mLeagues) {
    super(mContext, resource);
    this.mContext = mContext;
    this.mTeams = mTeams;
    this.mLeagues = mLeagues;
  }
  @Override
  public Object getItem(int position) {
    String teams = mTeams[position];
    String leagues = mLeagues[position];
    return String.format("%s \n%s",teams,leagues);
  }
  @Override
  public int getCount() {
    return mTeams.length;
  }
}
