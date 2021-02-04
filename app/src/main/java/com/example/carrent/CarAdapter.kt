package com.example.carrent

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CarAdapter(private var cars:List<Car>,private val context: Context): RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    class CarViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val buttonRent: Button = itemView.findViewById(R.id.button)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
        val textView1 : TextView = itemView.findViewById(R.id.textView2)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.car_item, parent, false)
        return CarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val p = cars[position]

        holder.textView.text = p.name
        holder.textView1.text = p.description

        holder.buttonRent.setOnClickListener{
            Toast.makeText(context,"თქვენ დაჯავშნეთ ${p.name}!!!", Toast.LENGTH_LONG).show()
            context.startActivity(Intent(context,FourthActivity::class.java))

        }



        Glide
            .with(context)
            .load(p.url)
            .placeholder(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(holder.imageView)


    }

    override fun getItemCount(): Int  = cars.size


}