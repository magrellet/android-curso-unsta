package com.martin.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String DEFAULT_SELECT_VALUE="Seleccione...";
    private static final String MASCULINO = "Masculino";
    private static final String FEMENINO = "Femenino";

    EditText name;
    EditText lastName;
    EditText email;
    EditText phone;
    TextView printName;
    TextView printLastName;
    TextView printEmail;
    TextView printPhone;
    TextView printGender;
    String selectedGender;

    private Spinner combo;
    private static String[] gender = new String[]{DEFAULT_SELECT_VALUE, MASCULINO, FEMENINO};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = (EditText) findViewById(R.id.name);
        lastName = (EditText) findViewById(R.id.last_name);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);

        printName = (TextView) findViewById(R.id.print_name);
        printLastName = (TextView) findViewById(R.id.print_last_name);
        printEmail = (TextView) findViewById(R.id.print_email);
        printPhone = (TextView) findViewById(R.id.print_phone);
        printGender = (TextView) findViewById(R.id.print_gender);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gender);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        combo = (Spinner)findViewById(R.id.combo);
        combo.setAdapter(adapter);

        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int position, long id) {
                Object item = adapterView.getItemAtPosition(position);

                if(!(item.toString().contains(DEFAULT_SELECT_VALUE))){
                    selectedGender=item.toString();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void imprimir(View view){

        printName.setText(name.getText());
        printLastName.setText(lastName.getText());
        printEmail.setText(email.getText());
        printPhone.setText(phone.getText());
        printGender.setText(selectedGender);

    }

    public void clear(View view){
        name.setText("");
        lastName.setText("");
        email.setText("");
        phone.setText("");
        combo.setSelection(0);

        printName.setText("");
        printLastName.setText("");
        printEmail.setText("");
        printPhone.setText("");
        printGender.setText("");

    }
}

