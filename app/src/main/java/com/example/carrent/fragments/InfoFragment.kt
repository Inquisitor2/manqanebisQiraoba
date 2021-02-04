package com.example.carrent.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carrent.Car
import com.example.carrent.CarAdapter
import com.example.carrent.R
import kotlinx.android.synthetic.*
import org.w3c.dom.Text
import kotlin.random.Random
import kotlin.random.nextInt

class InfoFragment:Fragment(R.layout.fragment_info) {


    private lateinit var randomNum : TextView
    private lateinit var randomButton:Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        randomButton = view.findViewById(R.id.randomButton)
        randomNum = view.findViewById(R.id.randomNumber)

        randomButton.setOnClickListener{


            val random = Random.nextInt(0..6)

            val colors = arrayOf("ყვითელი","ლურჯი","მწვანე","შავი","თეთრი","ცისფერი","იასამნისფერი")


            randomNum.text=colors[random]
    }




    }


}