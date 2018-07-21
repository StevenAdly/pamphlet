package com.example.steven.testnavbargpsconf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TraneemList extends AppCompatActivity {

    ListView lv;
    String[] traneem = new String[]{
            "انا طلبي اني اشوف المجد",//1
            "انا اناء اسود",//2
            "انا جايلك قلبي ذليل",//3
            "انا لست ارجوك لكي",//4
            "انا محتاج لمسة روحك",//5
            "انت لي المن الذي يشبع قلبي",//6
            "ايها الفخاري الاعظم",//7
            "بتفهمني وتحس بي",//8
            "الهنا عظيم",//9
            "بالاحضان الابوية",//10
            "ماتعولش الهم ", //11
            "مللك الملوك",//12
            "ياللي امامك حياتي ",//13
            "تعالوا تعالوا يا تعابي",//14
            "رب الوجود يا اله الكون",//15
            "ربي راعي وسلامي",//16
            "لا يكون ظلام ",//17
            "لا لا تركني وحدي",//18
            "قلبي بيك فرحان ",//19
            "علمني انتظرك يارب",//20
            "مهما ضعفي امتلكني",//21
            "بشوق وحنين",//22
            "وحدك يا يسوع"};//23
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traneem_list);

        lv = (ListView) findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, traneem);
        if (lv != null) {
            lv.setAdapter(arrayAdapter);
        }

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(getApplicationContext(), T1.class));
                } else if (i == 1) {
                    startActivity(new Intent(getApplicationContext(), T2.class));
                } else if (i == 2) {
                    startActivity(new Intent(getApplicationContext(), T3.class));
                } else if (i == 3) {
                    startActivity(new Intent(getApplicationContext(), T4.class));
                } else if (i == 4) {
                    startActivity(new Intent(getApplicationContext(), T5.class));
                } else if (i == 5) {
                    startActivity(new Intent(getApplicationContext(), T6.class));
                } else if (i == 6) {
                    startActivity(new Intent(getApplicationContext(), T7.class));
                } else if (i == 7) {
                    startActivity(new Intent(getApplicationContext(), T8.class));
                } else if (i == 8) {
                    startActivity(new Intent(getApplicationContext(), T9.class));
                } else if (i == 9) {
                    startActivity(new Intent(getApplicationContext(), T10.class));
                } else if (i == 10) {
                    startActivity(new Intent(getApplicationContext(), T11.class));
                } else if (i == 11) {
                    startActivity(new Intent(getApplicationContext(), T12.class));
                } else if (i == 12) {
                    startActivity(new Intent(getApplicationContext(), T13.class));
                } else if (i == 13) {
                    startActivity(new Intent(getApplicationContext(), T14.class));
                } else if (i == 14) {
                    startActivity(new Intent(getApplicationContext(), T15.class));
                } else if (i == 15) {
                    startActivity(new Intent(getApplicationContext(), T16.class));
                } else if (i == 16) {
                    startActivity(new Intent(getApplicationContext(), T17.class));
                } else if (i == 17) {
                    startActivity(new Intent(getApplicationContext(), T18.class));
                } else if (i == 18) {
                    startActivity(new Intent(getApplicationContext(), T19.class));
                } else if (i == 19) {
                    startActivity(new Intent(getApplicationContext(), T20.class));
                } else if (i == 20) {
                    startActivity(new Intent(getApplicationContext(), T21.class));
                } else if (i == 21) {
                    startActivity(new Intent(getApplicationContext(), T22.class));
                } else if (i == 22) {
                    startActivity(new Intent(getApplicationContext(), T23.class));
                }


            }
        });


    }
}
