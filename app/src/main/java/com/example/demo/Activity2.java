package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Activity2 extends AppCompatActivity {

    private EditText edtEmail;
    private Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        edtEmail = findViewById(R.id.edit_email);
        btnUpdate = findViewById(R.id.btn_update);

        edtEmail.setText(Appult.mEmail);

        getSupportActionBar().setTitle("Act2");

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                backActivity();
            }
        });
    }

    private void backActivity() {
        String strEmailUpdate = edtEmail.getText().toString().trim();

        Appult.mEmail = strEmailUpdate;
        finish();
    }
}