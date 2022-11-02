package com.beyz.masterclassgiris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_yoneticiekrani.*
import kotlinx.android.synthetic.main.recycler_row.view.*


class yoneticiekrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoneticiekrani)

        var personelisimlist = ArrayList<String>()
        personelisimlist.add("Melike Güneş \nMatematik")
        personelisimlist.add("Enes Demir \nİngilizce")
        personelisimlist.add("Sıla Yazıcı \nMatematik")
        personelisimlist.add("Çağrı Bayrak \nFen Bilimleri")



        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager =layoutManager
        val adapter= RecyclerAdapter(personelisimlist)
        recyclerView.adapter =adapter

    }

    fun eklemeyiac(view: View){
        val intent = Intent(applicationContext,personeleklemeekrani::class.java)
        startActivity(intent)
    }
}