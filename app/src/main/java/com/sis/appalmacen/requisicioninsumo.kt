package com.sis.appalmacen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class requisicioninsumo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requisicioninsumo)

        var btnguarda = findViewById<Button>(R.id.btnGuarda)
        btnguarda.setOnClickListener {
            Toast.makeText(this, "Se a guardado la reqisicion", Toast.LENGTH_SHORT).show()
        }
    }
}