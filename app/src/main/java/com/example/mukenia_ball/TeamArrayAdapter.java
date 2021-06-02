package com.example.mukenia_ball;

import android.content.Context;
import android.widget.ArrayAdapter;

public class TeamArrayAdapter extends ArrayAdapter {
  private Context mContext;
  private String[] mTeams;

  public TeamArrayAdapter(Context mContext, int resource, String[] mTeams) {
    super(mContext, resource);
    this.mContext = mContext;
    this.mTeams = mTeams;
  }
  @Override
  public Object getItem(int position) {
    String teams = mTeams[position];
    return String.format("%s", teams);
  }

  @Override
  public int getCount() {
    return mTeams.length;
  }
}
