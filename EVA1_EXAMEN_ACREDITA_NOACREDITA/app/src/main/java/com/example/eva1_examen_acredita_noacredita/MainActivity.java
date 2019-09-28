package com.example.eva1_examen_acredita_noacredita;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView acreditar, calificacion, acreditado;
    SeekBar skacreditar, skcali;
    int acr = 70;
    int cali = 70;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        acreditar = findViewById(R.id.txtViewAcreditar);
        calificacion = findViewById(R.id.txtViewCali);
        acreditado = findViewById(R.id.txtViewAcr);
        skacreditar = findViewById(R.id.seekBarAcreditar);
        skcali = findViewById(R.id.seekBarCali);


        skcali.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                cali = progress * 10;
                calificacion.setText("Calificacion: " + String.valueOf(cali));
                if (cali < acr) {
                    acreditado.setText("REPROBADO!!!");
                    acreditado.setTextColor(Color.parseColor("#FFE20E27"));
                } else {
                    acreditado.setText("ACREDITADO!!!");
                    acreditado.setTextColor(Color.parseColor("#FF00574B"));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        skacreditar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                acr = progress * 10;
                acreditar.setText("Puntos para creditar: " + String.valueOf(acr));
                if (cali < acr) {
                    acreditado.setText("REPROBADO!!!");
                    acreditado.setTextColor(Color.parseColor("#FFE20E27"));
                } else {
                    acreditado.setText("ACREDITADO!!!");
                    acreditado.setTextColor(Color.parseColor("#FF00574B"));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
