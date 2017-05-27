package com.example.hafizumerbinnasir.appointadoctor;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
        public void change(View view){
            Intent i=new Intent(this,Medical_Facility.class);
            startActivity(i);
    }
    public void changeto2(View view){
            Intent intent=new Intent(this,Categories.class);
            startActivity(intent);
    }



    }

