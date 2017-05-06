package com.example.lenovopc.zedmed10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class medlist extends Activity {

    ListView M;
    private static final String[] data1 = new String[] {
            "Crocin", "Paracetamol"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medlist);
        M=(ListView)findViewById(R.id.listView2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, data1);


        M.setAdapter(adapter);
        M.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getBaseContext(), showmed.class);
              //  intent.putExtra("med",);
                startActivity(intent);

            }
        });



    }
        }







