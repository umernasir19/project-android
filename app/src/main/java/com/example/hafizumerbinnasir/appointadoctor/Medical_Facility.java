package com.example.hafizumerbinnasir.appointadoctor;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Medical_Facility extends AppCompatActivity {
    private Button aman,kkf,edhi,jdc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical__facility);
        aman=(Button) findViewById(R.id.aman);
        aman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call=new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:1021"));

                startActivity(call);

            }
        });
        kkf=(Button) findViewById(R.id.KKf);
        kkf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call=new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:1090"));
                startActivity(call);
            }
        });

        edhi=(Button) findViewById(R.id.edhi);
        edhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call=new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:115"));
                startActivity(call);
            }
        });
        jdc=(Button) findViewById(R.id.jdc);
        jdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call=new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:1024"));
                startActivity(call);
            }
        });

    }
}
