package bindservice.com.karrel.network.service;


import bindservice.com.karrel.network.model.UserList;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Rell on 2017. 11. 13..
 */

public interface TestService {

    @GET("users/list")
    Observable<UserList> getUserList();
}
