package com.example.protrack_bessa;

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
        setContentView(R.layout.activity_main);
        nfcPress = (Button)findViewById(R.id.button5);
        nfcPress.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button5){
            // where the database thing happens
        }
    }
}
