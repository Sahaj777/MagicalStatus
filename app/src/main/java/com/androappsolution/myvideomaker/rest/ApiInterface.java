package com.androappsolution.myvideomaker.rest;

import com.androappsolution.myvideomaker.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @FormUrlEncoded
    @POST("api/file_data.php")
    Call<MoviesResponse> getTopRatedMovies(@Field("id") String image_id);


}
