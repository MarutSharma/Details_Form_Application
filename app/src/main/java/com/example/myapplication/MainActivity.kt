package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editName:EditText = findViewById(R.id.editName)
        val editEmail:EditText = findViewById(R.id.editEmail)
        val editContact:EditText = findViewById(R.id.editContact)
        val btnSubmit:Button = findViewById(R.id.btnSubmit)
        val textStatus:TextView = findViewById(R.id.textStatus)
        val textName:TextView = findViewById(R.id.textName)
        val textContact:TextView = findViewById(R.id.textContact)
        val textEmail:TextView = findViewById(R.id.textEmail)

        btnSubmit.setOnClickListener {
            textStatus.text = "Form Submitted"

            val name = editName.text.toString()
            val email = editEmail.text.toString()
            val contact = editContact.text.toString()

            textName.text = name
            textContact.text = contact
            textEmail.text = email
        }
    }
}