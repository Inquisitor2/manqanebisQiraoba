package com.example.carrent.fragments

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carrent.Car
import com.example.carrent.CarAdapter
import com.example.carrent.R

class NewFragment: Fragment(R.layout.fragment_new) {

    private lateinit var recyclerView: RecyclerView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerView)

        val natureList = ArrayList<Car>()

        natureList.add(Car("https://images-ext-1.discordapp.net/external/gT7XjzoaSio9_r0XxZ5ck5Q1aafHgPJRqs2aNv27Pvg/%3F_nc_cat%3D100%26ccb%3D2%26_nc_sid%3D730e14%26_nc_ohc%3DQ5IOD-R7xkMAX-GWO8M%26_nc_ht%3Dscontent.ftbs4-1.fna%26oh%3D8e584c9921623d5cb1e2a67d5a61d0d2%26oe%3D6040CE41/https/scontent.ftbs4-1.fna.fbcdn.net/v/t1.0-9/95206561_2940060656041263_4210175317202960384_o.jpg?width=859&height=636","Mercedes","+∞"))
        natureList.add(Car("https://www.thecarexpert.co.uk/wp-content/uploads/2020/05/Medium-32926-Mercedes-BenzCLACoup.jpg","Mercedes-Benz CLA","200$ დღეში"))
        natureList.add(Car("https://upload.wikimedia.org/wikipedia/commons/f/f6/2018_Mercedes-Benz_A200_AMG_Line_Premium%2B_1.3_Front.jpg","Mercedes-Benz A-Class","20$ დღეში"))
        natureList.add(Car("https://images.carandbike.com/car-images/large/mercedes-benz/g-class/mercedes-benz-g-class.jpg?v=3","Mercedes G Class","65$ დღეში"))
        natureList.add(Car("https://s.aolcdn.com/commerce/autodata/images/USC90MBC891A021001.jpg","Mercedes C 300","35$ დღეში"))
        natureList.add(Car("https://s4.paultan.org/image/2020/08/2020-Mercedes-Benz-C-200-Coupe-AMG-Line-1-e1597825083896.jpg","Mercedes C 200","70$ დღეში"))
        natureList.add(Car("https://carsguide-res.cloudinary.com/image/upload/f_auto%2Cfl_lossy%2Cq_auto%2Ct_default/v1/editorial/2020-bmw-m8-competition-justin-hilliard-27.png","BMW M8","150$ დღეში"))
        natureList.add(Car("https://upload.wikimedia.org/wikipedia/commons/3/30/2016_Toyota_Prius_%28ZVW50R%29_Hybrid_liftback_%282016-04-02%29_01.jpg","Toyota Prius","15$ დღეში"))
        natureList.add(Car("https://cdn.motor1.com/images/mgl/6yPGX/s3/2021-dodge-charger-srt-hellcat-redeye.jpg","Dodge Charger","100$ დღეში"))
        natureList.add(Car("https://upload.wikimedia.org/wikipedia/commons/1/1f/2019_Ford_Mustang_GT_5.0_facelift.jpg","Ford Mustang","97$ დღეში"))
        natureList.add(Car("https://carsalesbase.com/wp-content/uploads/2019/05/Toyota_RAV4-auto-sales-statistics-Europe.jpg","Toyota RAV4","45$ დღეში"))
        natureList.add(Car("https://1cars.org/wp-content/uploads/2020/06/Moskvich-408-800x443.jpg","Moskvich-408","ჩუქდება!"))





        val adapter = CarAdapter(natureList, view.context)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        recyclerView.adapter = adapter



    }


}