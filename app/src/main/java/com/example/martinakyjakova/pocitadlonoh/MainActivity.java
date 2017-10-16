package com.example.martinakyjakova.pocitadlonoh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText husy;
    private EditText kraliky;
    private Button spocitej;
    private Editable husyString;
    private int husyCislo;
    private Editable celkem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        husy = (EditText) findViewById(R.id.main_pocetHus);
        kraliky = (EditText) findViewById(R.id.main_pocetKraliku);
        spocitej = (Button) findViewById(R.id.main_spocitej);


        spocitej.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                kliknu(view);
            }
        });
    }
    private void kliknu (View view){
        int kraliciCislo = Integer.parseInt (kraliky.getText().toString());
        int husyCislo = Integer.parseInt (husy.getText().toString());

        int celkem = kraliciCislo * 4 + husyCislo * 2 ;
        Toast.makeText(this, "Celkem: " + celkem, Toast.LENGTH_SHORT).show();

    }
}
