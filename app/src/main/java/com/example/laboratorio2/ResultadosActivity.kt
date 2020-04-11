package com.example.laboratorio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultados.*

class ResultadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)


        val datosIntent: Intent = intent


        var resultado: String = datosIntent.getStringExtra("resultado")
        edtResultado.text = "Su IMC es: $resultado"


        if(resultado.toString().toFloat() in 1..19){
            edtMensaje.setText(R.string.IMC_bajo)
            imgResultado.setImageResource(R.color.colorAccent)


        }else if(resultado.toString().toFloat() in 20..25){
            edtMensaje.setText(R.string.IMC_normal)
            imgResultado.setImageResource(R.color.colorPrimary)


        }else if(resultado.toFloat() in 26..30){
            edtMensaje.setText(R.string.IMC_alto)
            imgResultado.setImageResource(R.color.colorPrimaryDark)


        }
    }
}
