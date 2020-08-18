package com.mini.testretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StoreService {
    @GET("store")
    Call <List<Store>> storeInfo();
}
