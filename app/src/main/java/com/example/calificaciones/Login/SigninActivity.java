package com.example.calificaciones.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.calificaciones.R;

public class SigninActivity extends AppCompatActivity {
    private EditText edtxtEmailUser;
    private EditText edtxtPassUser;
    private Button btnSigninUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        edtxtEmailUser = findViewById(R.id.edtxt_email_user);
        edtxtPassUser = findViewById(R.id.edtxt_pass_user);
        btnSigninUser = findViewById(R.id.btn_signin_user);



        btnSigninUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtxtEmailUser.getText().toString();
                String pass = edtxtPassUser.getText().toString();
                Bundle bndle = new Bundle();
                bndle.putString("email", email);
                bndle.putString("pass", pass);
                Intent intent = new Intent(SigninActivity.this, LoginActivity.class);
                intent.putExtras(bndle);
                startActivity(intent);
            }
        });


    }
}
