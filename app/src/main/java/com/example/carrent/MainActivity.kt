package com.example.carrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var inputEmail : TextView
    private lateinit var inputPassword : TextView

    private lateinit var registrationButton:Button
    private lateinit var loginButton: Button

    private lateinit var mAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputEmail = findViewById(R.id.inputEmail)
        inputPassword = findViewById(R.id.inputPassword)

        registrationButton = findViewById(R.id.regButton)

        loginButton = findViewById(R.id.loginButton)

        mAuth = FirebaseAuth.getInstance()


        registrationButton.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))

        }

        loginButton.setOnClickListener{

            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this,"Empty",Toast.LENGTH_SHORT).show()
            }else{
                mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener{ task ->
                    if (task.isSuccessful){
                        startActivity(Intent(this,ThirdActivity::class.java))
                    }else{
                        Toast.makeText(this,"Error!",Toast.LENGTH_SHORT).show()
                    }

                }
            }


        }



    }
}