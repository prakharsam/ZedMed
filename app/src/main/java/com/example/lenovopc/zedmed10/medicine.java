package com.example.lenovopc.zedmed10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class medicine extends Activity {

    AutoCompleteTextView autoComplete;
    Intent i;

    public static final String[] dataArray = new String[] {
            "Crocin", "Cropin","Paracetamol", "Citrizine", "Soframycin", "Volini"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        autoComplete = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, dataArray);
        autoComplete.setAdapter(adapter);

        autoComplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String med = dataArray[position];
                i= new Intent(getBaseContext(),showmed.class);
                i.putExtra("med", autoComplete.getText().toString());
                startActivity(i);

            }
        });

    }
}
