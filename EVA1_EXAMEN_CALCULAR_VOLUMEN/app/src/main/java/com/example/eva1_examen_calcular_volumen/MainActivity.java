package com.example.eva1_examen_calcular_volumen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText radio;
    TextView angulo;
    SeekBar seekBar;
    Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio = findViewById(R.id.txtRadio);

        angulo = findViewById(R.id.txtAngulo);

        calcular = findViewById(R.id.button);

        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            //int i es el progreso de la barra, la cual tiene de atributo 360 como maximo
            //este metodo se activa cada vez que se mueve la barra y se cambia su "progreso"
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                angulo.setText(""+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //Si se da click en la pantalla se esconde el teclado
        findViewById(R.id.linearPrincipal).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                return true;
            }
        });

        //Calcular datos
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //por si falta algun dato el try
                try {
                    String sRadio = radio.getText().toString();
                    double iRadio = Double.parseDouble(sRadio);
                    double iAngulo = Double.parseDouble(angulo.getText().toString());
                    double cuña = ((2.0 / 3.0) * (iAngulo * iRadio * 3)); //Formula del documento V=(2/3)(ar3)
                    Toast.makeText(getApplicationContext(),
                            "Radio: " + iRadio + "\n" +
                                    "Angulo: " + iAngulo + "\n" +
                                    "Volumen cuña: " + cuña, Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Faltan Datos",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
