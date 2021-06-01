package com.example.classroom;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class registerActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView fanhui;
    private EditText et_call;
    private EditText et_yanzm;
    private Button iv_imgb;
    private EditText et_pasdd;
    private ImageView iv_imga;
    private Button regis;
    private TextView fuwenben;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }

    private void initView() {
        fanhui = (ImageView) findViewById(R.id.fanhui);
        et_call = (EditText) findViewById(R.id.et_call);
        et_yanzm = (EditText) findViewById(R.id.et_yanzm);
        iv_imgb = (Button) findViewById(R.id.iv_imgb);
        et_pasdd = (EditText) findViewById(R.id.et_pasdd);
        iv_imga = (ImageView) findViewById(R.id.iv_imga);
        regis = (Button) findViewById(R.id.regis);
        fuwenben = (TextView) findViewById(R.id.fuwenben);

        iv_imgb.setOnClickListener(this);
        regis.setOnClickListener(this);
        fanhui.setOnClickListener(this);
        iv_imga.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_imgb:

                break;
            case R.id.regis:

                break;
            case R.id.fanhui:
                finish();
                break;
            case R.id.iv_imga:
                et_pasdd.setTransformationMethod(iv_imga.isSelected() ? PasswordTransformationMethod.getInstance() : HideReturnsTransformationMethod.getInstance());
                iv_imga.setSelected(!iv_imga.isSelected());
                break;
        }
    }

    private void submit() {
        // validate
        String call = et_call.getText().toString().trim();
        if (TextUtils.isEmpty(call)) {
            Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
            return;
        }

        String yanzm = et_yanzm.getText().toString().trim();
        if (TextUtils.isEmpty(yanzm)) {
            Toast.makeText(this, "请输入验证码", Toast.LENGTH_SHORT).show();
            return;
        }

        String pasdd = et_pasdd.getText().toString().trim();
        if (TextUtils.isEmpty(pasdd)) {
            Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}