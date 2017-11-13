package bindservice.com.karrel.network;

import bindservice.com.karrel.network.model.UserList;
import bindservice.com.karrel.network.service.TestService;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Rell on 2017. 11. 13..
 */

public class NetworkManager {
    private static NetworkManager instance;

    private Retrofit retrofit;
    private TestService service;

    public static NetworkManager getInstance() {
        if (instance == null) instance = new NetworkManager();
        return instance;
    }

    public NetworkManager() {
        retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com/")
                .build();

        service = retrofit.create(TestService.class);

    }

    public Observable<UserList> getUserList() {
        return service.getUserList()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                ;

    }
}
