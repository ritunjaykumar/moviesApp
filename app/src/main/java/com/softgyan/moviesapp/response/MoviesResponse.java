package com.softgyan.moviesapp.response;


import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.softgyan.moviesapp.models.MoviesModel;

/**
 * ** this class is for single movie request
 * 1. finding movies object
 */
public class MoviesResponse {
    //1. comments
    @SerializedName("results")
    @Expose
    private MoviesModel movie;

    public MoviesModel getMovie() {
        return movie;
    }

    @NonNull
    @Override
    public String toString() {
        return "MoviesResponse{" +
                "Movies=" + movie +
                "}";
    }
}
