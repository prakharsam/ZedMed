package com.example.lenovopc.zedmed10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button prb,med,abt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prb=(Button)findViewById(R.id.button);
        med=(Button)findViewById(R.id.button2);
        abt=(Button)findViewById(R.id.button3);

        prb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Body.class);
                startActivity(intent);
            }
        });

        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), medicine.class);
                startActivity(intent);
            }
        });

        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),abtus.class);
                startActivity(i);

            }
        });



    }
}
