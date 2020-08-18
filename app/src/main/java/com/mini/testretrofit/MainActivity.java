package com.mini.testretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView tv_name,tv_rating,tv_homepage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_name = findViewById(R.id.tv_name);
        tv_rating = findViewById(R.id.tv_rating);
        tv_homepage = findViewById(R.id.tv_homepage);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://222.234.36.82:58003/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        StoreService storeService = retrofit.create(StoreService.class);

        Call<List<Store>> call = storeService.storeInfo();
        call.enqueue((new Callback<List<Store>>() {
            @Override
            public void onResponse(Call<List<Store>> call, Response<List<Store>> response) {

                List<Store> storeList = response.body();
                for (Store store : storeList) {
                    tv_name.setText(store.getName());
                    tv_homepage.setText(store.getHomepage());
                    tv_rating.setText(Integer.toString(store.getRating()));
                }
            }

            @Override
            public void onFailure(Call<List<Store>> call, Throwable t) {

            }
        }));
//        call.enqueue(new Callback<List<Store>>() {
//            @Override
//            public void onResponse(Call<List<Store>> call, Response<List<Store>> response) {
////                if (!response.isSuccessful()) {
////                    tv_name.setText(response.code());
////                    return;
////                }
//                Store store = response.body();
//                tv_name.setText(store.getName());
//                tv_homepage.setText(store.getHomepage());
//                tv_rating.setText(store.getRating());
//
//            }
//
//            @Override
//            public void onFailure(Call<Store> call, Throwable t) {
//
//            }
//        });

    }
}
