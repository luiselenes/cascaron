package com.sis.appalmacen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class jefeObraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jefe_obra)

        val btnCreaproyecto = findViewById<Button>(R.id.btnCreaproyecto)
        val botonEditaLista = findViewById<Button>(R.id.btnModificarListaInsumos)
        val botoncrearlista = findViewById<Button>(R.id.btnCreaListaInsumos)

        btnCreaproyecto.setOnClickListener{
            intent= Intent(this, crearproyecto ::class.java)
            startActivity(intent)
        }
        botonEditaLista.setOnClickListener{
            intent= Intent(this, listainsumos::class.java)
            startActivity(intent)
        }
        botoncrearlista.setOnClickListener{
            intent= Intent(this, listainsumos::class.java)
            startActivity(intent)
        }






    }
}