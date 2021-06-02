package com.example.mukenia_ball;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TeamApi {
  @GET("teams/search")
  Call<MukeniaBallTeamResponses> getTeams(
      @Query("team") String team
  );
}
