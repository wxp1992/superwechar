package cn.ucai.superwechat.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.ucai.superwechat.R;
import cn.ucai.superwechat.utils.MFGT;

public class GuideActivity extends BaseActivity {
    GuideActivity mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(R.layout.activity_guide);
    }

    public void login(View view) {
        MFGT.gotoLogin(mContext);
    }

    public void register(View view) {
        MFGT.gotoRegister(mContext);

    }
}
