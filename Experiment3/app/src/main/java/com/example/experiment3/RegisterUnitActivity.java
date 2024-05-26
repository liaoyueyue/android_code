package com.example.experiment3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterUnitActivity extends AppCompatActivity {

    private EditText editTextUnit;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_unit);

        editTextUnit = findViewById(R.id.editTextUnit);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        // 获取上一个界面传递过来的用户名
        Intent intent = getIntent();
        final String username = intent.getStringExtra("username");

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unit = editTextUnit.getText().toString();

                // 创建 Intent 并传递用户信息
                Intent displayIntent = new Intent(RegisterUnitActivity.this, DisplayRegisterInfoActivity.class);
                displayIntent.putExtra("username", username);
                displayIntent.putExtra("unit", unit);
                startActivity(displayIntent);
            }
        });
    }
}


