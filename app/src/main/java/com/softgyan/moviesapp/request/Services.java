package com.softgyan.moviesapp.request;

import com.softgyan.moviesapp.utils.Credentials;
import com.softgyan.moviesapp.utils.MoviesApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Services {

    private static final Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
            .baseUrl(Credentials.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());
    private static final Retrofit retrofit = retrofitBuilder.build();
    private static final MoviesApi moviesApi = retrofit.create(MoviesApi.class);

    public MoviesApi getMoviesApi(){
        return moviesApi;
    }

}
