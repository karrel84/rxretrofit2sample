package bindservice.com.karrel.rxretrofit2sample.presenter;

import bindservice.com.karrel.network.model.UserList;

/**
 * Created by Rell on 2017. 11. 13..
 */

public interface MainPresenter {
    void goRetro();

    interface View {

        void showText(UserList userList);
    }
}
