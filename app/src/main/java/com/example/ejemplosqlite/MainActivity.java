package com.example.ejemplosqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);
    }

    // Metodo para boton Registrar Usuario
    public void registrar_usuario(View view){
        Intent registrar = new Intent(this, RegistrarUsuario.class);
        startActivity(registrar);
    }

    public void consular_usuario(View view){
        Intent consultar = new Intent(this, ConsultarUsuario.class);
        startActivity(consultar);
    }
}
