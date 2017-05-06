package com.example.lenovopc.zedmed10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Body extends Activity {
    Button head,shoulder,chest,hand,joints,feet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);

        head=(Button)findViewById(R.id.head);
        shoulder=(Button)findViewById(R.id.shoulder);
        chest=(Button)findViewById(R.id.chest);
        hand=(Button)findViewById(R.id.hand);
        joints=(Button)findViewById(R.id.joint);
        feet=(Button)findViewById(R.id.feet);


        head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Symptoms_head.class);


                startActivity(intent);
            }
        });


    }
}
