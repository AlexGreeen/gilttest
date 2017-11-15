package com.al.gilttest.data.remote.giltapi;


import com.al.gilttest.data.remote.constants.Constants;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiProvider {
    private static ApiProvider instance;
    private static SalesService salesApi;
   /* int cacheSize = 10 * 1024 * 1024;
    Cache cache = new Cache(getCacheDir(), cacheSize);*/


    private ApiProvider() {
    }

    public static ApiProvider getInstance() {
        if (instance == null) {
            instance = new ApiProvider();
        }
        return instance;
    }

    private SalesService createSalesApi(Retrofit retrofit) {
        return retrofit.create(SalesService.class);
    }

    public SalesService getSalesApi() {
        if (salesApi == null) {
            salesApi = createSalesApi(createRetrofit(Constants.G_BASE_URL.toString(),
                    createClient(Constants.G_KEY_QUERY.toString(),
                            Constants.G_API_KEY.toString())));
        }
        return salesApi;
    }


    private Retrofit createRetrofit(String baseUrl, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private OkHttpClient createClient(final String queryParam, final String key) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        return new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        HttpUrl url = request.url()
                                .newBuilder()
                                .addQueryParameter(queryParam, key)
                                .build();
                        request = request.newBuilder().url(url).build();
                        return chain.proceed(request);
                    }
                }).build();
    }


}
