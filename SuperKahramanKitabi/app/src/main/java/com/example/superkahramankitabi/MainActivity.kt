package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //veri hazırlığı
        var superKahramanIsimleri=ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Iron Man")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Spiderman")

        //verimsiz tanımlar verimli yolu btk akademiden bak
        val batmanBitmap= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val SupermanBitmap= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val IronmanBitmap= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val aquamanBitmap= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spidermanBitmap= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        var superKahramanGörselleri=ArrayList<Bitmap>()
        superKahramanGörselleri.add(batmanBitmap)
        superKahramanGörselleri.add(SupermanBitmap)
        superKahramanGörselleri.add(IronmanBitmap)
        superKahramanGörselleri.add(aquamanBitmap)
        superKahramanGörselleri.add(spidermanBitmap)
        //Adaptter
        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager

        val adapter=RecyclerAdapter(superKahramanIsimleri,superKahramanGörselleri)
        recyclerView.adapter=adapter
    }
}