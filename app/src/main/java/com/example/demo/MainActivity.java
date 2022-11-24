package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtEmail;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.edit_email);
        btnSend = findViewById(R.id.btn_send);

        getSupportActionBar().setTitle("Act1");

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity();
            }
        });
    }

    private void nextActivity() {
        String strEmail = edtEmail.getText().toString().trim();
        Appult.mEmail = strEmail;
        Intent intent = new Intent( MainActivity.this, Activity2.class );
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        edtEmail.setText(Appult.mEmail);
    }
}