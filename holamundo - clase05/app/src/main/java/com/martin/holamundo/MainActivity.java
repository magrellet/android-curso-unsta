package com.martin.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Titular[] titular = new Titular[]{
                new Titular("Titulo1","Subtitulo1"),
                new Titular("Titulo2","Subtitulo2"),
                new Titular("Titulo3","subtitulo3")};

        final Intent intent = new Intent(this, SecondActivity.class);

        ListView listView = (ListView) findViewById(R.id.listView);
        final AdapterTitulares adapter = new AdapterTitulares(this, titular);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Object item = adapterView.getItemAtPosition(i);

                Titular item = (Titular) adapterView.getItemAtPosition(i);
                String titulo = item.getTitulo();
                String subtitulo = item.getSubtitulo();

                intent.putExtra("titulo",titulo);
                intent.putExtra("subtitulo",subtitulo);
                startActivity(intent);
            }
        });
    }

}

