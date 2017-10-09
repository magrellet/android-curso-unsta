package com.martin.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textViewName = (TextView) findViewById(R.id.name_id);
        textViewName.setText("Martin");

        TextView textViewLastName = (TextView) findViewById(R.id.last_name_id);
        textViewLastName.setText("Grellet");

        TextView textViewAge = (TextView) findViewById(R.id.age_id);
        textViewAge.setText("31");

        TextView textViewOccupation = (TextView) findViewById(R.id.occupation_id);
        textViewOccupation.setText("Dev");
    }
}
