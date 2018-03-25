package com.example.protrack_bessa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class default_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_page);

        // switch to parent page
        Button parent = (Button)findViewById(R.id.activateParent);
        parent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent startIntent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
        });

        // switch to driver page
        Button driver = (Button)findViewById(R.id.activateDriver);
        driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent startIntent1= new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(startIntent1);
            }
        });
    }
}
