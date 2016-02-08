package com.example.igor.laboratorio1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private int cont=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout l = (LinearLayout) findViewById(R.id.LytContenedor);
        l.setBackgroundColor(Color.GREEN);
        /*TextView cuadro = new TextView(this);
        cuadro.setText("Hello world");
        setContentView(cuadro);*/
        Button contador = (Button) findViewById(R.id.btnContador);
        final TextView lblContador = (TextView) findViewById(R.id.lblContador);
        contador.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cont++;
                lblContador.setText("Se ha clicado: "+cont);
            }
        });
    }

    /*@Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        LinearLayout l = (LinearLayout) findViewById(R.id.LytContenedor);
        outState.putInt("backgroundColor", Color.GREEN );
        System.out.println(outState.getInt("backgroundColor"));
        Log.d("Color", Integer.toString(outState.getInt("backgroundColor")));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        LinearLayout l = (LinearLayout) findViewById(R.id.LytContenedor);
        l.setBackgroundColor(savedInstanceState.getInt("backgroundColor"));
    }
*/
    public void saluda(View v){
        EditText nombre = (EditText) findViewById(R.id.txtNombre);
        TextView saludar = (TextView) findViewById(R.id.lblSaludo);
        saludar.setText("Hola "+nombre.getText());
        saludar.setVisibility(View.VISIBLE);
    }
    public void cambiarVentana(View v){

        setContentView(R.layout.ventana_dos);
    }
    public void cambiarVentana1(View v){
        setContentView(R.layout.activity_main);
    }
}
