package com.example.carrent.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.carrent.MainActivity
import com.example.carrent.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment:Fragment(R.layout.fragment_home) {

    private lateinit var logButton:Button
    private lateinit var logoView:ImageView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        logButton = view.findViewById(R.id.logoutButton)
        logoView = view.findViewById(R.id.logoView)

        logButton.setOnClickListener{
            startActivity(Intent(activity,MainActivity::class.java))
        }

        val url = "https://i.pinimg.com/originals/be/b7/93/beb7933295c2c58760b15c6cac4f0041.png"



        Glide
            .with(view.context)
            .load(url)
            .placeholder(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(view.logoView)

    }

}