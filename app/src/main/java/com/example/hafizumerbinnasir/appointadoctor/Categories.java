package com.example.hafizumerbinnasir.appointadoctor;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.hafizumerbinnasir.Audiologist.AUDIOLOGIST;


public class Categories extends AppCompatActivity{

        public ListView listView;
        String[] listPlanet={
                "AUDIOLOGIST\n" ,
                "CARDIOLOGIST\n" ,
                "CHEST PHYSICIAN\n" ,
                "DENTAL SURGEON\n" ,
                "DERMATOLOGIST\n" ,
                "DIABETOLOGIST\n" ,
                "ENDOCRINOLOGIST\n" ,
                "ENT SURGEON\n" ,
                "EYE SURGEON\n" ,
                "GASTROENTEROLOGIST\n" ,
                "GENERAL PHYSICIAN\n" ,
                "GENERAL SURGEON\n" ,
                "GYNAECOLOGIST\n" ,
                "MAXILLOFASCIAL SURGEON\n" ,
                "NEPHROLOGIST\n" ,
                "NEUROSURGEON\n" ,
                "NEUROLOGIST\n" ,
                "ORTHODONTIST\n" ,
                "ORTHOPEDIC SURGEON\n" ,
                "PAEDIATRIC SURGEON\n" ,
                "PEDIATRICIAN\n" ,
                "PHYSIOTHERAPIST\n" ,
                "PSYCHIATRIST\n" ,
                "UROLOGIST"};

        @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
        @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
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
                        Intent myIntent = new Intent(view.getContext(), AUDIOLOGIST.class);
                        startActivity(myIntent);
                    }
//                    else if (position == 1) {
//                       Intent myintent=new Intent(view.getContext(),doctor2.class);
//                       startActivity(myintent);
//                    }
//                    else if (position == 2) {
//                        Intent myIntent = new Intent(view.getContext(), doctor3.class);
//                        startActivity(myIntent);
//                }
                    }


        });
        }
}