package com.example.tictoc;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button btnReiniciar;
    TextView txvMensaje;
    Boolean c1, c2, c3, c4, c5, c6, c7, c8, c9;
    int turno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Botones
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);


        txvMensaje = findViewById(R.id.textView_Mensaje);
        btnReiniciar = findViewById(R.id.button);
        //Desabilitar Boton Reiniciar
        btnReiniciar.setEnabled(false);

        turno = 1; //Inicializamos la variable turno a 1 para que inicie el juegaro #1

        //Inicializamos la variable boleanas a false
        c1 = false;
        c2 = false;
        c3 = false;
        c4 = false;
        c5 = false;
        c6 = false;
        c7 = false;
        c8 = false;
        c9 = false;

        b1.setText("-");
        b2.setText("-");
        b3.setText("-");
        b4.setText("-");
        b5.setText("-");
        b6.setText("-");
        b7.setText("-");
        b8.setText("-");
        b9.setText("-");

        txvMensaje.setText("Turno: X");

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    if (turno == 1) {
                        turno = 2;
                        b1.setText("X");
                        b1.setTextColor(getResources().getColor(R.color.colorX));
                        txvMensaje.setText("Turno: O");
                        b1.setEnabled(false);//Desabilitar Boton

                    } else if (turno == 2) {
                        turno = 1;
                        b1.setText("O");
                        b1.setTextColor(getResources().getColor(R.color.colorO));
                        txvMensaje.setText("Turno: X");
                        b1.setEnabled(false);//Desabilitar Boton
                    }
                c1 = true;
                validarMov();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    b2.setText("X");
                    b2.setTextColor(getResources().getColor(R.color.colorX));
                    txvMensaje.setText("Turno: O");
                    b2.setEnabled(false);//Desabilitar Boton

                } else if (turno == 2) {
                    turno = 1;
                    b2.setText("O");
                    b2.setTextColor(getResources().getColor(R.color.colorO));
                    txvMensaje.setText("Turno: X");
                    b2.setEnabled(false);//Desabilitar Boton
                }
                c2 = true;
                validarMov();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    b3.setText("X");
                    b3.setTextColor(getResources().getColor(R.color.colorX));
                    txvMensaje.setText("Turno: O");
                    b3.setEnabled(false);//Desabilitar Boton

                } else if (turno == 2) {
                    turno = 1;
                    b3.setText("O");
                    b3.setTextColor(getResources().getColor(R.color.colorO));
                    txvMensaje.setText("Turno: X");
                    b3.setEnabled(false);//Desabilitar Boton
                }
                c3 = true;
                validarMov();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    b4.setText("X");
                    b4.setTextColor(getResources().getColor(R.color.colorX));
                    txvMensaje.setText("Turno: O");
                    b4.setEnabled(false);//Desabilitar Boton

                } else if (turno == 2) {
                    turno = 1;
                    b4.setText("O");
                    b4.setTextColor(getResources().getColor(R.color.colorO));
                    txvMensaje.setText("Turno: X");
                    b4.setEnabled(false);//Desabilitar Boton
                }
                c4 = true;
                validarMov();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    b5.setText("X");
                    b5.setTextColor(getResources().getColor(R.color.colorX));
                    txvMensaje.setText("Turno: O");
                    b5.setEnabled(false);//Desabilitar Boton
                } else if (turno == 2) {
                    turno = 1;
                    b5.setText("O");
                    b5.setTextColor(getResources().getColor(R.color.colorO));
                    txvMensaje.setText("Turno: X");
                    b5.setEnabled(false);//Desabilitar Boton
                }
                c5 = true;
                validarMov();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    b6.setText("X");
                    b6.setTextColor(getResources().getColor(R.color.colorX));
                    txvMensaje.setText("Turno: O");
                    b6.setEnabled(false);//Desabilitar Boton

                } else if (turno == 2) {
                    turno = 1;
                    b6.setText("O");
                    b6.setTextColor(getResources().getColor(R.color.colorO));
                    txvMensaje.setText("Turno: X");
                    b6.setEnabled(false);
                }
                c6 = true;
                validarMov();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    b7.setText("X");
                    b9.setTextColor(getResources().getColor(R.color.colorX));
                    txvMensaje.setText("Turno: O");
                    b7.setEnabled(false);//Desabilitar Boton

                } else if (turno == 2) {
                    turno = 1;
                    b7.setText("O");
                    b7.setTextColor(getResources().getColor(R.color.colorO));
                    txvMensaje.setText("Turno: X");
                    b7.setEnabled(false);//Desabilitar Boton
                }
                c7 = true;
                validarMov();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    b8.setText("X");
                    b8.setTextColor(getResources().getColor(R.color.colorX));
                    txvMensaje.setText("Turno: O");
                    b8.setEnabled(false);//Desabilitar Boton

                } else if (turno == 2) {
                    turno = 1;
                    b8.setText("O");
                    b8.setTextColor(getResources().getColor(R.color.colorO));
                    txvMensaje.setText("Turno: X");
                    b8.setEnabled(false);//Desabilitar Boton
                }
                c8 = true;
                validarMov();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (turno == 1) {
                    turno = 2;
                    b9.setText("X");
                    b9.setTextColor(getResources().getColor(R.color.colorX));
                    txvMensaje.setText("Turno: O");
                    b9.setEnabled(false);//Desabilitar Boton

                } else if (turno == 2) {
                    turno = 1;
                    b9.setText("O");
                    b9.setTextColor(getResources().getColor(R.color.colorO));
                    txvMensaje.setText("Turno: X");
                    b9.setEnabled(false);//Desabilitar Boton
                }
                c9 = true;
                validarMov();
            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void validarMov() {

        String tb1,tb2,tb3,tb4,tb5,tb6,tb7,tb8,tb9;

        boolean fin = false;

        String ganador = "";

        tb1 = b1.getText().toString();
        tb2 = b2.getText().toString();
        tb3 = b3.getText().toString();
        tb4 = b4.getText().toString();
        tb5 = b5.getText().toString();
        tb6 = b6.getText().toString();
        tb7 = b7.getText().toString();
        tb8 = b8.getText().toString();
        tb9 = b9.getText().toString();

        /**
         * Validacion de movimientos X
         * */

        //Fila - horizontal
        if (tb1.equals("X") && tb2.equals("X") && tb3.equals("X")) {
           // b1.setBackgroundColor(getResources().getColor(R.color.colorX));
                   txvMensaje.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila \ diagonal
        if (tb1.equals("X") && tb5.equals("X") && tb9.equals("X")) {
            txvMensaje.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila | diagonal
        if (tb1.equals("X") && tb4.equals("X") && tb7.equals("X")) {
            txvMensaje.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }

        //Fila central | vertical
        if (tb2.equals("X") && tb5.equals("X") && tb8.equals("X")) {
            txvMensaje.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila 3ra | vertical
        if (tb3.equals("X") && tb6.equals("X") && tb9.equals("X")) {
            txvMensaje.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila 2da - central
        if (tb4.equals("X") && tb5.equals("X") && tb6.equals("X")) {
            txvMensaje.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila 3ra - abajo
        if (tb7.equals("X") && tb8.equals("X") && tb9.equals("X")) {
            txvMensaje.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila / dagonal
        if (tb3.equals("X") && tb5.equals("X") && tb7.equals("X")) {
            txvMensaje.setText("GANA X");
            ganador = "X";
            Toast.makeText(this, "GANA X", Toast.LENGTH_LONG).show();
            fin = true;
        }

        /**
         * Validacion de movimientos O
         * */

        //Fila - horizontal
        if (tb1.equals("O") && tb2.equals("O") && tb3.equals("O")) {
            txvMensaje.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila \ diagonal
        if (tb1.equals("O") && tb5.equals("O") && tb9.equals("O")) {
            txvMensaje.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila | diagonal
        if (tb1.equals("O") && tb4.equals("O") && tb7.equals("O")) {
            txvMensaje.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }

        //Fila central | vertical
        if (tb2.equals("O") && tb5.equals("O") && tb8.equals("O")) {
            txvMensaje.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila 3ra | vertical
        if (tb3.equals("O") && tb6.equals("O") && tb9.equals("O")) {
            txvMensaje.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila 2da - central
        if (tb4.equals("O") && tb5.equals("O") && tb6.equals("O")) {
            txvMensaje.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila 3ra - abajo
        if (tb7.equals("O") && tb8.equals("O") && tb9.equals("O")) {
            txvMensaje.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }
        //Fila / dagonal
        if (tb3.equals("O") && tb5.equals("O") && tb7.equals("O")) {
            txvMensaje.setText("GANA O");
            ganador = "O";
            Toast.makeText(this, "GANA O", Toast.LENGTH_LONG).show();
            fin = true;
        }

        /**
         * Validadcion de empate
         * */

        if (c1 == true)
            if (c2 == true)
                if (c3 == true)
                    if (c4 == true)
                        if (c5 == true)
                            if (c6 == true)
                                if (c7 == true)
                                    if (c8 == true)
                                        if (c9 == true) {
                                            txvMensaje.setText("EMPATE");
                                            ganador = "EMPATE";
                                            Toast.makeText(this, ganador, Toast.LENGTH_LONG).show();
                                            fin = true;
                                        }

        if (fin) {

            //En caso de que uno de los jugadores gane primero, y el tablero no esta lleno
            // se desahabilita todos lo botones para evitar que sigan jugando
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

            //Se habilita el boton reiniciar
            btnReiniciar.setEnabled(true);

            new AlertDialog.Builder(this)
                    .setTitle("Fin del juego, Ha ganado" + "\" " + ganador + " \"")
                    .setMessage("¿Volver a jugar?")
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            recreate();
                        }

                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            btnReiniciar.setEnabled(true);
                        }
                    })
                    .show();
        }
    }
}
