package com.sis.appalmacen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pantallaresidente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantallaresidente)
        val botonrequisicion = findViewById<Button>(R.id.btnCrearRequisicionInsumos)

        botonrequisicion.setOnClickListener {
            intent = Intent(this, requisicioninsumo::class.java)
            startActivity(intent)
        }
    }
}