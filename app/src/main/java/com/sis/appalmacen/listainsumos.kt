package com.sis.appalmacen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class listainsumos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listainsumos)
        var btnguarda=findViewById<Button>(R.id.btnguarda)

        var tvnolista= findViewById<EditText>(R.id.et_nolista)
        var tv_modulo=findViewById<EditText>(R.id.et_modulo)

        var tv_clave=findViewById<EditText>(R.id.et_clave)
        var tv_nombreinsumo=findViewById<EditText>(R.id.et_nombreinsumo)

        var tv_partida=findViewById<EditText>(R.id.et_partida)
        var tv_cantidad=findViewById<EditText>(R.id.et_cantidad)
        var tv_unidad=findViewById<EditText>(R.id.et_unidad)



        }

    }






