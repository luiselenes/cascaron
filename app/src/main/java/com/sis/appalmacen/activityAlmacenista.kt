package com.sis.appalmacen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activityAlmacenista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almacenista)


        val botonEntradaInsumo = findViewById<Button>(R.id.btnEntradaInsumos)
        val botonBuscaInsumo = findViewById<Button>(R.id.btnBuscarInsumo)
        val botonReporte = findViewById<Button>(R.id.btnReporte)
        val botoncerrar= findViewById<Button>(R.id.btncerrars)
        val botongestion= findViewById<Button>(R.id.btngestioninsumo)
        val botonprocesarri= findViewById<Button>(R.id.btn_procesarrequisicioni)


        botonBuscaInsumo.setOnClickListener{
            val intento3 = Intent(this, listaActivity::class.java)
            startActivity(intento3)
        }
        botongestion.setOnClickListener{
            val intento4 = Intent(this, gestorinsumo ::class.java)
            startActivity(intento4)
        }



        botonReporte.setOnClickListener{
            val intento5 = Intent(this, reportesActivity::class.java)
            startActivity(intento5)
        }
        botonEntradaInsumo.setOnClickListener{
            val intent = Intent(this, Entrada::class.java)
            startActivity(intent)
        }
        botoncerrar.setOnClickListener{
            val intent1 = Intent(this, loginActivity::class.java)
            startActivity(intent1)
        }
        botonprocesarri.setOnClickListener{
            val intent2 = Intent(this, procesarri::class.java)
            startActivity(intent2)
        }
    }
}