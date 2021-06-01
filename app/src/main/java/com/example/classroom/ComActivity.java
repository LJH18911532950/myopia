package com.example.classroom;

import android.content.Intent;
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

public class ComActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_cell;
    private EditText et_password;
    private ImageView iv_img;
    private EditText et_verification;
    private ImageView iv_proof;
    private ImageView iv_imageg;
    private Button login;
    private TextView tv_register;
    private TextView tv_forget;
    private TextView sps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com);
        initView();
    }

    private void initView() {
        et_cell = (EditText) findViewById(R.id.et_cell);
        et_password = (EditText) findViewById(R.id.et_password);
        iv_img = (ImageView) findViewById(R.id.iv_img);
        et_verification = (EditText) findViewById(R.id.et_verification);
        iv_proof = (ImageView) findViewById(R.id.iv_proof);
        iv_imageg = (ImageView) findViewById(R.id.iv_imageg);
        login = (Button) findViewById(R.id.login);
        tv_register = (TextView) findViewById(R.id.tv_register);
        tv_forget = (TextView) findViewById(R.id.tv_forget);
        sps = (TextView) findViewById(R.id.sps);

        login.setOnClickListener(this);
        tv_register.setOnClickListener(this);
        tv_forget.setOnClickListener(this);
        iv_img.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                submit();
                break;
            case R.id.tv_register:
                Intent intent = new Intent(ComActivity.this, registerActivity.class);
                startActivity(intent);
                break;
            case R.id.iv_img:
                et_password.setTransformationMethod(iv_img.isSelected() ? PasswordTransformationMethod.getInstance() : HideReturnsTransformationMethod.getInstance());
                iv_img.setSelected(!iv_img.isSelected());
                break;
            case R.id.tv_forget:

                startActivity( new Intent(ComActivity.this, ForgetActivity.class));
                break;
        }
    }

    private void submit() {
        // validate
//        String cell = et_cell.getText().toString().trim();
//        String password = et_password.getText().toString().trim();
//        String verification = et_verification.getText().toString().trim();
//        if (TextUtils.isEmpty(cell)) {
//            Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
//            return;
//        }else if (TextUtils.isEmpty(password)) {
//            Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
//            return;
//        }else if (TextUtils.isEmpty(verification)) {
//            Toast.makeText(this, "请验证码", Toast.LENGTH_SHORT).show();
//            return;
//        }else{
//
//        }
        startActivity(new Intent(ComActivity.this,InfoActivity.class));
        // TODO validate success, do something


    }
}