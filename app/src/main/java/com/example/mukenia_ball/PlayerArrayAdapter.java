package com.example.mukenia_ball;

import android.content.Context;
import android.widget.ArrayAdapter;

public class PlayerArrayAdapter extends ArrayAdapter {
  private Context mContext;
  private String[] mPeople;

  public PlayerArrayAdapter(Context mContext, int resource, String[] mPeople) {
    super(mContext, resource);
    this.mContext = mContext;
    this.mPeople = mPeople;
  }
  @Override
  public Object getItem(int position) {
    String people = mPeople[position];
    return String.format("%s", people);
  }

  @Override
  public int getCount() {
    return mPeople.length;
  }
}
