package com.gustavo.appclima

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ciudades.*

class CiudadesActivity : AppCompatActivity() {

    val TAG = "com.gustavo.appclima.ciudadesactivity.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)


        btnLima.setOnClickListener(View.OnClickListener {

        val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-lima")
            startActivity(intent)

        })

        btnBerlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-berlin")
            startActivity(intent)

        })



    }
}
