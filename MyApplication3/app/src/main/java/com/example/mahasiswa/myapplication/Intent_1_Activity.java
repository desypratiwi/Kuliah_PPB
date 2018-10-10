package com.example.mahasiswa.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class Intent_1_Activity extends AppCompatActivity {
    private Button mMenu1, mBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_1);
        mMenu1 =(Button)findViewById(R.id.bt_register);
        mBack =(Button)findViewById(R.id.bt_back);
        mMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"latihan intent menu1",Toast.LENGTH_LONG).show();
            }
        });
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(getApplicationContext(), IntentActivity.class);
                startActivity(iBack);
                finish();
            }
        });
    }
}

