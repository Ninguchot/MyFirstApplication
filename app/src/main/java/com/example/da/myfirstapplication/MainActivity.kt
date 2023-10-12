package com.example.da.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var campo1: EditText
    lateinit var botao1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        campo1 = findViewById(R.id.nome)
        botao1 = findViewById(R.id.botao)
        botao1.setOnClickListener(object : View.OnClickListener{

        })

    }
}