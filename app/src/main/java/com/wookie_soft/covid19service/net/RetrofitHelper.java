package com.wookie_soft.covid19service.net;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitHelper {

        static public void RtrofitHelper(String baseUrl){

             Retrofit retrofit = new Retrofit.Builder()
                     .baseUrl(baseUrl)
                     .addConverterFactory(GsonConverterFactory.create())
                     .addConverterFactory(ScalarsConverterFactory.create())
                     .build();
        }

}
