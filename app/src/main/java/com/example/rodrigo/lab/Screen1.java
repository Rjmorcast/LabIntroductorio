package com.example.rodrigo.lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Screen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        final ListView lv = (ListView) findViewById(R.id.lv);



        String[] fruits = new String[] {
                "WaterMelon",
                "Strawberry",
                "Mora",
                "Orange"
        };

        // Create a List from String Array elements
        final List<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));

        // Create an ArrayAdapter from List
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, fruits_list);
        lv.setAdapter(arrayAdapter);

       lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(Screen1.this, Screen2.class);
                myIntent.putExtra("key", parent.getSelectedItem().toString()); //Optional parameters
                Screen1.this.startActivity(myIntent);
            }
        });

    }

}
