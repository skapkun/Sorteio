package com.unir.sorteio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoSorteio;
    private TextView resulSorteio;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoSorteio = findViewById (R.id.botaoSorteio);
        resulSorteio = findViewById (R.id.resulSorteio);

        botaoSorteio.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick (View view){
                int num = new Random ().nextInt (100);
                resulSorteio.setText ("Resultado: "+ num);
            }
        });
    }
}