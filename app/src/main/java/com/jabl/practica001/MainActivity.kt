package com.jabl.practica001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"mensaje",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"mensaje",Toast.LENGTH_LONG).show()

    }
}
