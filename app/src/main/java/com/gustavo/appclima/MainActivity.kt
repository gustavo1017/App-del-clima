package com.gustavo.appclima

import android.app.Activity
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.location.FusedLocationProviderClient

class MainActivity : AppCompatActivity() {
    var tvPais:TextView?= null
    var tvTiempo:TextView?=null
    var tvEstatus:TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        tvPais = findViewById(R.id.tvPais)
        tvTiempo = findViewById(R.id.tvTiempo)
        tvEstatus = findViewById(R.id.txtClima)


            val ciudad = intent.getStringExtra("com.gustavo.appclima.ciudadesactivity.CIUDAD")

            Toast.makeText(this, ciudad,Toast.LENGTH_SHORT).show()

            val ciudadLima = Ciudad("Ciudad de lima",17,"Nublado")
        val ciudadBerlin = Ciudad("Ciudad de berlin",28,"Soleado")

        if(ciudad=="ciudad-lima"){
            tvPais?.text=ciudadLima.nombre
            tvTiempo?.text=ciudadLima.grados.toString()+"°"
            tvEstatus?.text=ciudadLima.estatus
        }else if(ciudad=="ciudad-berlin"){
            tvPais?.text=ciudadBerlin.nombre
            tvTiempo?.text=ciudadBerlin.grados.toString()+"°"
            tvEstatus?.text=ciudadBerlin.estatus
        }else{
            Toast.makeText(this, "No contamos con esa ciudad",Toast.LENGTH_SHORT).show()
        }
        }

}
