package com.example.tdpa_3p_ej01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val bundle = intent.extras
        val dato = bundle?.getString("Direccion") /* Esto es la llave para que obtenga la direccion
                                                         que vaya escribiendo el usuario y asi empiece a buscar*/
        val act:Boolean? = bundle?.getBoolean("Activado") // Es lo mismo como del de la varibale "dato"
        val web = findViewById<WebView>(R.id.webPrincipal)
        val btnFinalizar = findViewById<Button>(R.id.btnFin)
        val txtAct = findViewById<TextView>(R.id.txtAct)


        /* Aqui en la linea de abajo lo que hace es que carga la pagina con una cadena
       que se concatena con la variable dato para que el usuario no tenga que escribir
       toda la direccion URL pero se va validando mediante Booleans si es "True" se muestra la pagina
       que se desea buscar y si es "False" se manda un error en la busqueda
       */
        if(act == true ){
            txtAct.text = "ACTIVADO"
            web.loadUrl("https://${dato}")
        }else{
            txtAct.text = "DESACTIVADO"
            web.loadUrl("http://${dato}")
        }




        btnFinalizar.setOnClickListener{
            finish()
        }
    }
}