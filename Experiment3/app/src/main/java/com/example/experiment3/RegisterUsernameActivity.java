package com.example.experiment3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterUsernameActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_username);

        editTextUsername = findViewById(R.id.editTextUsername);
        buttonNext = findViewById(R.id.buttonNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                // 假设简单地将用户名传递到下一个界面
                Intent intent = new Intent(RegisterUsernameActivity.this, RegisterUnitActivity.class);
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });
    }
}


