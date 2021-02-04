package com.example.carrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SecondActivity : AppCompatActivity() {

    private lateinit var inputEmail : TextView
    private lateinit var inputPassword : TextView

    private lateinit var backButton:Button

    private lateinit var registrationButton : Button
    private lateinit var mAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        inputEmail = findViewById(R.id.inputEmail)
        inputPassword = findViewById(R.id.inputPassword)

        registrationButton = findViewById(R.id.regButton)
        backButton = findViewById(R.id.backButton)

        mAuth = FirebaseAuth.getInstance()

        registrationButton.setOnClickListener{

            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this,"Empty!",Toast.LENGTH_SHORT).show()
            } else {
                mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener{ task ->
                    if (task.isSuccessful) {
                        startActivity(Intent(this,MainActivity::class.java))
                        finish()
                    }else{
                        Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
                    }

                }
            }

        }

        backButton.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }



    }
}