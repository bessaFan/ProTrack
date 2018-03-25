package com.example.protrack_bessa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    Button nfcPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nfcPress = (Button)findViewById(R.id.button5);
        nfcPress.setOnClickListener(this);
        // switch to student page
        Button student = (Button)findViewById(R.id.student_info);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent startIntent1= new Intent(getApplicationContext(), Main4Activity.class);
                startActivity(startIntent1);
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button5){

        }
    }


}