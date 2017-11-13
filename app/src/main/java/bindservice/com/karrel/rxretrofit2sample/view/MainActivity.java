package bindservice.com.karrel.rxretrofit2sample.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bindservice.com.karrel.network.model.UserList;
import bindservice.com.karrel.rxretrofit2sample.R;
import bindservice.com.karrel.rxretrofit2sample.databinding.ActivityMainBinding;
import bindservice.com.karrel.rxretrofit2sample.presenter.MainPresenter;
import bindservice.com.karrel.rxretrofit2sample.presenter.MainPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainPresenter.View {

    private ActivityMainBinding binding;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        presenter = new MainPresenterImpl(this);

        binding.goRetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.goRetro();
            }
        });
    }

    @Override
    public void showText(UserList userList) {
        binding.text.setText(userList.toString());
    }
}
