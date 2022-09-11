package com.example.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
accionarTexto();
leerPassword();

    }
    public void Registrar(View View) {
        Intent Registrar = new Intent(this, MainActivity2.class);
        startActivity(Registrar);
    }
        public void Perfil(View View){
            Intent Perfil = new Intent(this,MainActivity4.class);
            startActivity(Perfil);
    }
    @SuppressLint("SetTextI18n")
    private void accionarTexto(){
            TextView miPrimerTxt = (TextView)  findViewById( R. id. miPrimerTexto);
            miPrimerTxt.setText("login");
            miPrimerTxt.setTextColor(Color.BLACK);
            miPrimerTxt.setTypeface(Typeface.MONOSPACE, Typeface.BOLD );
            miPrimerTxt.getText();

        }
    private void leerPassword() {
        EditText miPassword=(EditText) findViewById(R.id.tPassword);
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
                Toast.makeText(MainActivity.super.getBaseContext(),password,Toast.LENGTH_SHORT).show();

            }
        });

        }

    @Override
    public void onClick(View view) {

    }
}

