package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et1=findViewById(R.id.et1);
        EditText et2=findViewById(R.id.et2);
        EditText ans=findViewById(R.id.ans);
        ans.setEnabled(false);
        Button btnAdd=findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(et1.getText().toString());
                int n2=Integer.parseInt(et2.getText().toString());
                int ans1=n1+n2;
                Log.d("add",ans.toString());
                ans.setText(ans1+"");
            }
        });

    }
}