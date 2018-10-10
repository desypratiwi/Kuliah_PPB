package com.example.mahasiswa.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class IntentActivity extends AppCompatActivity {
    private Button mBtn_menu1, mBtn_menu2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        //inisial tombol
        mBtn_menu1 = (Button)findViewById(R.id.btn_menu1);
        mBtn_menu2=(Button)findViewById(R.id.btn_menu2);
        // function tombol
        mBtn_menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMenu1 = new Intent(getApplicationContext(),Intent_1_Activity.class);
                startActivity(iMenu1);
            }
        });
        mBtn_menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMenu2 = new Intent(getApplicationContext(), Intent_2_Activity.class);
                startActivity(iMenu2);
            }
        });
        Button dialog = findViewById(R.id.btn_alert_dialog);
        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mDialog= new Intent(getApplicationContext(), AlertDialogActivity.class);
                startActivity(mDialog);
                finish();
            }
        });
        Button notif = findViewById(R.id.notifactionMenu);
        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mNotif= new Intent(getApplicationContext(), NotificationActivity.class);
                startActivity(mNotif);
                finish();
            }
        });
    }
}