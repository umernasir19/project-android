package com.example.hafizumerbinnasir.appointadoctor;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Categories extends AppCompatActivity{

        public ListView listView;
        String[] listPlanet={"Anatomy","Bones and joints","Child Specialist","Cardiologist","Dentist","Dermatologist","E.N.T","Generel physician","Anatomy","Bones and joints","Child Specialist","Cardiologist","Dentist","Dermatologist","E.N.T","Generel physician"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_categories);

            listView = (ListView)findViewById(R.id.lv);

            ArrayAdapter<String> adapter =
                    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {
                        Intent myIntent = new Intent(view.getContext(), Doctor1.class);
                        startActivity(myIntent);
                    }
                    else if (position == 1) {
                       Intent myintent=new Intent(view.getContext(),doctor2.class);
                       startActivity(myintent);
                    }
                    else if (position == 2) {
                        Intent myIntent = new Intent(view.getContext(), doctor3.class);
                        startActivity(myIntent);
                }
                    }


        });
        }
}