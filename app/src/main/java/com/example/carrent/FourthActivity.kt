package com.example.carrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.carrent.fragments.HomeFragment
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {

    private lateinit var congrat:ImageView
    private lateinit var backButton:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        congrat = findViewById(R.id.imageView2)
        backButton = findViewById(R.id.button3)

        backButton.setOnClickListener{
            finish()
        }

        val url = "https://thumbs.dreamstime.com/b/operator-linear-icon-modern-outline-logo-concept-wh-white-background-delivery-logistics-collection-suitable-use-133517717.jpg"


        Glide
            .with(this)
            .load(url)
            .placeholder(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(imageView2)
    }
}