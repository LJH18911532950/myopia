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

public class ForgetActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView fanhui2;
    private EditText et_cell_2;
    private EditText et_yzm;
    private TextView tv_yzm;
    private TextView tv_code;
    private EditText et_code;
    private ImageView iv_img_2;
    private Button btn_regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        initView();
    }

    private void initView() {
        fanhui2 = (ImageView) findViewById(R.id.fanhui2);
        et_cell_2 = (EditText) findViewById(R.id.et_cell_2);
        et_yzm = (EditText) findViewById(R.id.et_yzm);
        tv_yzm = (TextView) findViewById(R.id.tv_yzm);
        tv_code = (TextView) findViewById(R.id.tv_code);
        et_code = (EditText) findViewById(R.id.et_code);
        iv_img_2 = (ImageView) findViewById(R.id.iv_img_2);
        btn_regis = (Button) findViewById(R.id.btn_regis);

        btn_regis.setOnClickListener(this);
        iv_img_2.setOnClickListener(this);
        fanhui2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_regis:

                break;
            case R.id.iv_img_2:
                et_code.setTransformationMethod(iv_img_2.isSelected() ? PasswordTransformationMethod.getInstance() : HideReturnsTransformationMethod.getInstance());
                iv_img_2.setSelected(!iv_img_2.isSelected());

                break;
            case R.id.fanhui2:
                finish();
                break;
        }
    }

    private void submit() {
        // validate

        String trim = et_cell_2.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
            return;
        }

        String yzm = et_yzm.getText().toString().trim();
        if (TextUtils.isEmpty(yzm)) {
            Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }

        String code = et_code.getText().toString().trim();
        if (TextUtils.isEmpty(code)) {
            Toast.makeText(this, "请验证码", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}