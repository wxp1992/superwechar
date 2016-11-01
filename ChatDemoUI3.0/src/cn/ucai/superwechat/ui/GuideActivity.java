package cn.ucai.superwechat.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.ucai.superwechat.R;

public class GuideActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
    }

    public void login(View view) {
        startActivityForResult(new Intent(this, LoginActivity.class), 0);
    }

    public void register(View view) {
        startActivityForResult(new Intent(this, RegisterActivity.class), 0);

    }
}
