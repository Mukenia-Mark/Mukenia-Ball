package com.example.mukenia_ball;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.mukenia_ball.Constants.API_KEY;
import static com.example.mukenia_ball.Constants.API_TEAMS_URL;

public class TeamClient {

  private static Retrofit retrofit = null;

  public static TeamApi getClient() {
    if (retrofit == null) {
      OkHttpClient okHttpClient = new OkHttpClient.Builder()
          .addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
              Request newRequest = chain.request().newBuilder()
                  .addHeader("Authorization", API_KEY)
                  .build();
              return chain.proceed(newRequest);
            }
          })
      .build();

      retrofit = new Retrofit.Builder()
          .baseUrl(API_TEAMS_URL)
          .client(okHttpClient)
          .addConverterFactory(GsonConverterFactory.create())
          .build();
    }
    return retrofit.create(TeamApi.class);
  }
}
