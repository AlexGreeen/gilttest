package com.al.gilttest.data;


import android.support.annotation.NonNull;

import com.al.gilttest.data.remote.giltapi.ApiProvider;
import com.al.gilttest.data.remote.model.salesResponse.SalesResponse;
import com.al.gilttest.ui.events.main.SalesListMapper;
import com.al.gilttest.ui.events.main.SalesVM;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataManager {
    private static DataManager instance;
    private List<SalesVM> salesList = new ArrayList<>();
    private OnCompleteCallback completeCallback;

    private DataManager() {
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public void registerCallback(OnCompleteCallback completeCallback) {
        this.completeCallback = completeCallback;
    }

    public void salesResponse(final String salesStatus) {
        Call<SalesResponse> call = ApiProvider.getInstance().getSalesApi().getSales(salesStatus);
        call.enqueue(new Callback<SalesResponse>() {
            @Override
            public void onResponse(@NonNull Call<SalesResponse> call, @NonNull Response<SalesResponse> response) {
                if (response.code() == 200) {
                    SalesResponse sr = response.body();
                    salesList = SalesListMapper.mapToList(sr);
                    completeCallback.onComplete(salesList);
                }
            }

            @Override
            public void onFailure(@NonNull Call<SalesResponse> call, @NonNull Throwable t) {
                t.printStackTrace();
            }
        });
    }

    public interface OnCompleteCallback {
        void onComplete(List<SalesVM> data);
    }
}


