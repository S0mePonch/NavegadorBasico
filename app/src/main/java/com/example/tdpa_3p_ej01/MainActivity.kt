package com.example.tdpa_3p_ej01

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVer = findViewById<Button>(R.id.btnAccept);
        val txtDireccion = findViewById<EditText>(R.id.txtDireccion)
        val swtModo = findViewById<Switch>(R.id.swtModo)

        // Lo que se esta haciendo en las lineas de abajo es la funcion del boton "Ver" y de txtView
        btnVer.setOnClickListener{
            val Intent = Intent(this, ViewActivity::class.java)
            Intent.putExtra("Direccion", txtDireccion.text.toString())
            Intent.putExtra("Activado", swtModo.isChecked)
            startActivity(Intent)
        }
    }
}