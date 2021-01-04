package com.softgyan.moviesapp.response;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.softgyan.moviesapp.models.MoviesModel;

import java.util.List;

/**
 * this class is for getting multiple movies (movies list) - popular movies
 */
public class MovieSearchResponse {
    @SerializedName("total_results")
    @Expose()
    private int total_count;

    @SerializedName("results")
    @Expose()
    private List<MoviesModel> movies;

    public int getTotal_count() {
        return total_count;
    }

    public List<MoviesModel> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "MovieSearchResponse{" +
                "total_count=" + total_count +
                ", movies=" + movies +
                '}';
    }
}
