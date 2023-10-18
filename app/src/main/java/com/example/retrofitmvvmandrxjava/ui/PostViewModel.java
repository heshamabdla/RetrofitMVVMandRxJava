package com.example.retrofitmvvmandrxjava.ui;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.retrofitmvvmandrxjava.data.PostClient;
import com.example.retrofitmvvmandrxjava.pojo.PostModel;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostViewModel extends ViewModel {

    private static final String TAG = "PostViewModel Error";
    MutableLiveData<List<PostModel>> postMutableLiveData =new MutableLiveData<>();


    public  void getPost() {
        Single<List<PostModel>> observable=PostClient.getInstance().getPost()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        observable.subscribe(o-> postMutableLiveData.setValue(o), e-> Log.d(TAG,"get Posts : "+e));

    }
}
