package com.example.tdpa_3p_ej01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val bundle = intent.extras
        val dato = bundle?.getString("Direccion") /* Esto es la llave para que obtenga la direccion
                                                         que vaya escribiendo el usuario y asi empiece a buscar*/

        val web = findViewById<WebView>(R.id.webPrincipal)
        val btnFinalizar = findViewById<Button>(R.id.btnFin)

        /* Aqui en la linea de abajo lo que hace es que carga la pagina con una cadena
        que se concatena con la variable dato para que el usuario no tenga que escribir
        toda la direccion URL
        */
        web.loadUrl("https://${dato}")

        btnFinalizar.setOnClickListener{
            finish()
        }
    }
}