package com.wookie_soft.covid19service.net;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService{

        @GET("")
        Call<String> getApiDataToString();








        }
