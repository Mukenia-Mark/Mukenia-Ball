package com.example.mukenia_ball;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlayerApi {
  @GET("player/search")
  Call<MukeniaBallPlayerResponses> getPlayers(
      @Query("person") String Person
  );
}
