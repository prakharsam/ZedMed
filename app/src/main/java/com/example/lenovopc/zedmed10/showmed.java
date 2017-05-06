package com.example.lenovopc.zedmed10;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

public class showmed extends Activity {


    private HashMap<String, String> map = new HashMap<>();
    {
        map.put(medicine.dataArray[0],"Crocin\n" +
                "\n" +
                "        Crocin advance can be used for treatment of mild to moderate pain. Muscle ache like back pain,neck pain, for headache , joined pain\n" +
                "        every 4-6 hours 1 or 2 tablets. Maximum dose in 24 hours not to exceed 4 grams. \n" +
                "        For age adults and children over 12.");
        map.put(medicine.dataArray[1],"Details 2");

        map.put(medicine.dataArray[2],"Details 3");
        map.put(medicine.dataArray[3],"Details 4");
        map.put(medicine.dataArray[4],"Details 5");
        map.put(medicine.dataArray[5],"Details 6");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showmed);
        setUpHashMap();
        String med = getIntent().getStringExtra("med");
        ((TextView)findViewById(R.id.medicineDesc)).setText(map.get(med));
        System.out.println(med);

    }
    private void setUpHashMap(){
       }




}
