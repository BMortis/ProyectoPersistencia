package com.example.persistencia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText etRut, etCorreo;
    private Spinner spnTipo;
    private Button btnGrabar, btnEliminar, btnRetroceder, btnAvanzar;
    private TextView tvPagina;

    //Trabajar el Spinner con un arreglo o arraylist
    private String[] tipoCliente;
    private ArrayAdapter<> adapterTipo;

    //Clientes
    private ArrayList<Cliente> losClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referencias();
        eventos();
        //Metodo para poblar clientes
        poblar();


    }


    private void referencias(){
        etRut = findViewById(R.id.etRut);
        etCorreo = findViewById(R.id.etCorreo);
        spnTipo = findViewById(R.id.spnTipo);
        btnGrabar = findViewById(R.id.btnGrabar);
        btnEliminar = findViewById(R.id.btnEliminar);
        btnAvanzar= findViewById(R.id.btnAvanzar);
        btnRetroceder = findViewById(R.id.btnRetroceder);
        tvPagina = findViewById(R.id.tvPagina);
    }

    private void eventos(){

    }

    private void poblar(){
        //tipoCliente = new String[]{"Bueno", "Regular", "Malo"};
        tipoCliente = new String[3];
        tipoCliente[0] = "Bueno";
        tipoCliente[1] = "Regular";
        tipoCliente[2] = "Malo";

        losClientes = new ArrayList<Cliente>();
        losClientes.add(new Cliente("1-9", "aaa@aaa.cl", "Bueno"));
        losClientes.add(new Cliente("2-0", "bbb@aaa.cl", "Malo"));
        losClientes.add(new Cliente("3-1", "ccc@aaa.cl", "Regular"));
        losClientes.add(new Cliente("4-2", "eee@aaa.cl", "Bueno"));
    }
}