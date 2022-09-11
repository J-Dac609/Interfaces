package com.example.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        CheckBox miPrimerChekbox=(CheckBox) findViewById(R.id.checkBox2);
        if(miPrimerChekbox.isChecked()){
            EditText miPassword=(EditText) findViewById(R.id.editTextTextPassword);
            miPassword.setEnabled(false);

        }
        Password();

    }
    public void habilitarchek(View V){
        CheckBox miPrimerChekbox=(CheckBox) findViewById(R.id.checkBox2);
        EditText miPassword = (EditText) findViewById(R.id.editTextTextPassword);
        if(miPrimerChekbox.isChecked()) {
            miPassword.setEnabled(false);
        }else{
            miPassword.setEnabled(true);
        }


    }
    public void Volver(View View) {
        Intent Volver = new Intent(this, MainActivity.class);
        startActivity(Volver);
    }
    private void Password() {
        EditText miPassword=(EditText) findViewById(R.id.editTextTextPassword);
        miPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String password=miPassword.getText().toString();
                Toast.makeText(MainActivity2.super.getBaseContext(),password,Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}