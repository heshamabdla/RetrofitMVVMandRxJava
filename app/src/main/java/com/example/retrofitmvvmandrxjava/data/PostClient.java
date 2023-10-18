package com.example.retrofitmvvmandrxjava.data;

import com.example.retrofitmvvmandrxjava.pojo.PostModel;

import java.util.List;

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import io.reactivex.rxjava3.core.Single;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostClient {
    private static final String base_URL="https://jsonplaceholder.typicode.com/";
    private PostInterface postInterface;
    private static PostClient instance;


    public PostClient() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(base_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        postInterface=retrofit.create(PostInterface.class);
    }

    public static PostClient getInstance() {
        if (null == instance){
            instance = new PostClient();
        }
        return instance;
    }
    public Single<List<PostModel>> getPost(){
        return postInterface.getPost();
    }

}
