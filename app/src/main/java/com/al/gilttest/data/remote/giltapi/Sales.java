package com.al.gilttest.data.remote.giltapi;


import com.al.gilttest.data.remote.model.salesResponse.SalesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Sales {

    @GET("sales/{status}.json")
    Call<SalesResponse> getSales(@Path("status") String status);

    @GET("sales/{store}/{status}.json")
    Call<SalesResponse> getSalesStore(@Path("store") String store, @Path("status") String status);

}
