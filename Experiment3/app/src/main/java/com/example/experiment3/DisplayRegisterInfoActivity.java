package com.example.experiment3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayRegisterInfoActivity extends AppCompatActivity {
    private TextView textViewUserInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_register_info);

        textViewUserInfo = findViewById(R.id.textViewUserInfo);

        // 获取从上一个界面传递过来的用户信息
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String unit = intent.getStringExtra("unit");

        // 格式化用户信息并显示在 TextView 中
        String userInfo = "用户名：" + username + "\n单位：" + unit;
        textViewUserInfo.setText(userInfo);
    }
}
