package com.example.hafizumerbinnasir.Audiologist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.hafizumerbinnasir.appointadoctor.R;

public class  Dr_tahira_aleem extends AppCompatActivity {
    private  Button call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dr_tahira_aleem);
        call=(Button) findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call=new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:02136648237,545"));

                startActivity(call);

            }
        });
    }
}
