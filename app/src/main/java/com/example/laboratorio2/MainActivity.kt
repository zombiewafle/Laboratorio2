package com.example.laboratorio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnProcesar.setOnClickListener {
            var alturaCM = edtAltura.text.toString().toFloat()
            var alturaM = alturaCM/100f
            var pesoLB = edtPeso.text.toString().toFloat()
            var pesoKG = pesoLB/2.20462262f
            var edtAlturaAlCuadrado = alturaM * alturaM

            val newIntent:Intent = Intent(this,ResultadosActivity::class.java)
            val intent = Intent(this,MainActivity::class.java)


            val condicion = if (alturaCM == null || pesoLB == null || alturaCM > 270 || pesoLB > 270) {
                Toast.makeText(applicationContext, R.string.condicion, Toast.LENGTH_LONG).show()
                startActivity(intent)
                finish()


                }else {



                var resultado= (pesoKG/edtAlturaAlCuadrado).toString()

                newIntent.putExtra("resultado", resultado)
                startActivity(newIntent)
                finish()

            }
        }
    }
}