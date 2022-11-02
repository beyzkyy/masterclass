package com.beyz.masterclassgiris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class personelekrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personelekrani)
    }
    fun ogrenciler(view: View){
        val intent = Intent(applicationContext,personelekran2::class.java)
        startActivity(intent)
    }
}