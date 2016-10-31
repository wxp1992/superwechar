package com.hyphenate.chatuidemo.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hyphenate.chatuidemo.R;

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
