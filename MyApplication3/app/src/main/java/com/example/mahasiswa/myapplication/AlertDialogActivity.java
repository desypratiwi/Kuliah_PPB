package com.example.mahasiswa.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
public class AlertDialogActivity extends Activity implements OnClickListener {
    Button btnAlertTwoBtns, btnCustomAlert, btnAlertWithThreeBtns, btnAlert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        btnAlertTwoBtns = (Button) findViewById(R.id.btnAlertWithTwoBtns);
        btnCustomAlert = (Button) findViewById(R.id.btnCustomAlert);
        btnAlertWithThreeBtns = (Button) findViewById (R.id.btnAlertWithThreeBtns);
        btnAlert = (Button) findViewById (R.id.btnAlert);
        btnAlertTwoBtns.setOnClickListener(this);
        btnCustomAlert.setOnClickListener(this);
        btnAlertWithThreeBtns.setOnClickListener(this);
        btnAlert.setOnClickListener(this);
    }
    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.btnAlertWithTwoBtns:
                // Creating
                AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(this);
                // Setting dialog
                alertDialog2.setTitle("Konfirmasi Hapus ... ?");
                alertDialog2.setMessage("Yakin Data Dihapus ?");
                alertDialog2.setIcon(R.drawable.delete);
                alertDialog2.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Tombol YES ditekan", Toast.LENGTH_SHORT).show();
                            }
                        });
                alertDialog2.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Tombol NO ditekan", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });
                alertDialog2.show();
                break;
            case R.id.btnAlert:
                // Creating
                AlertDialog.Builder alertDialog1= new AlertDialog.Builder(this);
                // Setting Dialog
                alertDialog1.setTitle("Alert Dialog");
                alertDialog1.setMessage("Materi Dialog Mobile Programming");
                alertDialog1.setIcon(R.drawable.tick);
                alertDialog1.setNeutralButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Tombol OK ditekan", Toast.LENGTH_SHORT).show();
                            }
                        });
                alertDialog1.show();
                break;
            case R.id.btnAlertWithThreeBtns:
                // Creating
                AlertDialog.Builder alertDialog3= new AlertDialog.Builder(this);
                // Setting Dialog
                alertDialog3.setTitle("Simpan File");
                alertDialog3.setMessage("Simpan File Pekerjaan Anda");
                alertDialog3.setIcon(R.drawable.save);
                alertDialog3.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Tombol YES ditekan", Toast.LENGTH_SHORT).show();
                            }
                        });
                alertDialog3.setNeutralButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Tombol NO ditekan", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });
                alertDialog3.setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Tombol Cancel ditekan", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });
                alertDialog3.show();
                break;
            case R.id.btnCustomAlert:
                final Dialog dialog = new Dialog(this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.detail_info);
                Button dialobButton = (Button) dialog.findViewById(R.id.btn_custom_alert_ok);
                dialobButton.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }}

