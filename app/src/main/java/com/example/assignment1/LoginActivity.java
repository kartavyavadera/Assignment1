package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText etusername=findViewById(R.id.etUsername);
        EditText etpassword=findViewById(R.id.etPassword);
        Button btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((etusername.getText().toString().equals("admin")) && (etpassword.getText().toString().equals("admin"))){
                    Log.d("d",etusername.getText().toString());
                    Log.d("d1",etpassword.getText().toString());
                    Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_LONG).show();
                }
                else {
                    Log.d("details",etusername.getText().toString());
                    Log.d("details1",etpassword.getText().toString());
                    Toast.makeText(getApplicationContext(),"Failed to login!!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}