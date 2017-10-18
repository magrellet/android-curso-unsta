package com.martin.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText lastName;
    EditText email;
    EditText phone;
    TextView printName;
    TextView printLastName;
    TextView printEmail;
    TextView printPhone;


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

    }

    public void imprimir(View view){

        printName.setText(name.getText());
        printLastName.setText(lastName.getText());
        printEmail.setText(email.getText());
        printPhone.setText(phone.getText());

    }

    public void clear(View view){
        name.setText("");
        lastName.setText("");
        email.setText("");
        phone.setText("");

        printName.setText("");
        printLastName.setText("");
        printEmail.setText("");
        printPhone.setText("");

    }
}

