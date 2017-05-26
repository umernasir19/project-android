package com.example.hafizumerbinnasir.Audiologist;

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
import com.example.hafizumerbinnasir.appointadoctor.R;

public class AUDIOLOGIST extends AppCompatActivity {
    public ListView listView;
    String[] listPlanet={
            "Dr. Amtullah Shaikh\n" ,
            "Dr. Tahira Aleem\n" ,
            "DR. ABDUL LATIF\n" ,
            };

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiologist);




        listView = (ListView)findViewById(R.id.audiolist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPlanet);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Dr_amtullah.class);
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


