package com.example.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        findViewById(R.id.imageButton).setOnClickListener(this);
        findViewById(R.id.imageButton2).setOnClickListener(this);
        findViewById(R.id.resMensaje).setOnClickListener(this);

        crearTexto();
        colorTexto();
        cambiarTexto();
        cambiarTextoazul();
        tamañoTexto();
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton:
                TextView miPrimerTxt = (TextView) findViewById(R.id.llamadaEnt);
                miPrimerTxt.setText("RECIBIDA");
                miPrimerTxt.setTextColor(Color.GREEN);
                break;
            case R.id.imageButton2:
                TextView MiPrimerTxt = (TextView) findViewById(R.id.llamadaEnt);
                MiPrimerTxt.setText("RECHAZADA");
                MiPrimerTxt.setTextColor(Color.RED);
                break;
            case R.id.resMensaje:
                @SuppressLint("UseSwitchCompatOrMaterialCode") Switch miprimerSwitch = (Switch) findViewById(R.id.resMensaje);
                if (miprimerSwitch.isChecked()) {
                    cambiarTexto();
                } else {
                    colorTexto();
                }
            default:
                break;
        }

    }

    private void cambiarTextoazul() {
        TextView miPrimerTxt = (TextView) findViewById(R.id.textView5);
        miPrimerTxt.setTextColor(Color.BLUE);
    }
    private void cambiarTexto(){
        TextView miPrimerTxt = (TextView) findViewById(R.id.textView5);
        miPrimerTxt.setTextColor(Color.GREEN);

    }
    @SuppressLint("SetTextI18n")
    private void colorTexto() {
        TextView miPrimerTxt = (TextView) findViewById(R.id.textView5);
        miPrimerTxt.setText("DESEAS RESPONDER ESTE MENSAJE");
        miPrimerTxt.setTextColor(Color.BLACK);
        miPrimerTxt.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);
        miPrimerTxt.getText();
    }
    @SuppressLint("SetTextI18n")
    private void crearTexto(){
        TextView miPrimerTxt = (TextView)  findViewById( R. id. llamadaEnt);
        miPrimerTxt.setText("TIENES UNA LLAMADA ENTRANTE");
        miPrimerTxt.setTextColor(Color.BLACK);
        miPrimerTxt.setTypeface(Typeface.MONOSPACE, Typeface.BOLD );
        miPrimerTxt.getText();

    }
    private void tamañoTexto(){
        TextView PrimerTxt = (TextView)  findViewById( R. id. textView6);
        PrimerTxt.setText("TAMAÑO DE FUENTE");
        PrimerTxt.setTextColor(Color.BLACK);
        PrimerTxt.setTypeface(Typeface.MONOSPACE, Typeface.BOLD );
        PrimerTxt.getText();
    }
    public void Final(View View) {
        Intent Final = new Intent(this, MainActivity3.class);
        startActivity(Final);}

}