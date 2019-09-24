package com.wave.livedataexample.service;

import com.wave.livedataexample.model.BlogWrapper;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiService {


    @GET("feed.json")
    Call<BlogWrapper> getPopularBlog();

}
