package bindservice.com.karrel.network;

import org.junit.Test;

import bindservice.com.karrel.network.model.UserList;
import rx.functions.Action1;

/**
 * Created by Rell on 2017. 11. 13..
 */
public class NetworkManagerTest {

    @Test
    public void getUserList() throws Exception {
        NetworkManager.getInstance().getUserList().subscribe(new Action1<UserList>() {
            @Override
            public void call(UserList userList) {
                System.out.print(userList.toString());
            }
        });
    }

}