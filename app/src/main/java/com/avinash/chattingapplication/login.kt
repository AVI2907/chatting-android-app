package com.avinash.chattingapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText

class login : AppCompatActivity() {

    private lateinit var  edtEmail: EditText
    private lateinit var  edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var  btnSignUp: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        edtEmail=findViewById(R.id.edt_email)
        edtPassword=findViewById(R.id.edt_password)
        btnLogin =findViewById(R.id.btnlogin)
        btnSignUp=findViewById(R.id.btnSignUp)

        btnSignUp.setOnClickListener {
            val inetent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }





    }
}