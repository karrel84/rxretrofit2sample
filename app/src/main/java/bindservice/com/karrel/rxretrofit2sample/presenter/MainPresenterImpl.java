package bindservice.com.karrel.rxretrofit2sample.presenter;

import bindservice.com.karrel.network.NetworkManager;
import bindservice.com.karrel.network.model.UserList;
import rx.functions.Action1;

/**
 * Created by Rell on 2017. 11. 13..
 */

public class MainPresenterImpl implements MainPresenter {
    private MainPresenter.View view;

    public MainPresenterImpl(View view) {
        this.view = view;
    }

    @Override
    public void goRetro() {
        NetworkManager.getInstance().getUserList().subscribe(new Action1<UserList>() {
            @Override
            public void call(UserList userList) {
                view.showText(userList);
            }
        });
    }
}
