package com.example.experiment3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayInfoActivity extends AppCompatActivity {

    private TextView textViewDisplayInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        textViewDisplayInfo = findViewById(R.id.textViewDisplayInfo);

        // 获取从上一个界面传递过来的用户名和密码
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");

        String displayText = "用户名：" + username + "\n密码：" + password;
        textViewDisplayInfo.setText(displayText);
    }
}


