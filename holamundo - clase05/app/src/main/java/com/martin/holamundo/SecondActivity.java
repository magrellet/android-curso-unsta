package com.martin.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String titulo = intent.getStringExtra("titulo");
        String subTitulo = intent.getStringExtra("subtitulo");

        TextView viewSubTitulo  = (TextView) findViewById(R.id.txtSubTitulo);
        TextView viewTitulo = (TextView) findViewById(R.id.txtTitulo);

        viewTitulo.setText(titulo);
        viewSubTitulo.setText(subTitulo);
    }
}
