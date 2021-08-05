package com.sis.appalmacen

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.core.view.size
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import kotlinx.android.synthetic.main.lista_compra.*
import kotlinx.android.synthetic.main.lista_compra.view.*
import kotlinx.android.synthetic.main.lista_rc.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RequisicionCompra : AppCompatActivity() {

    //private lateinit var binding: ActivityRequisicionCompraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requisicion_compra)

         var btnguarda=findViewById<Button>(R.id.btnGuarda)
        btnguarda.setOnClickListener{
            Toast.makeText(this, "Se a guardado la requisicion", Toast.LENGTH_SHORT).show()
        }

    }
}

