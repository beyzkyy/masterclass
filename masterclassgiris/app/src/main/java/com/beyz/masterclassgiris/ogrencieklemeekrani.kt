package com.beyz.masterclassgiris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ogrencieklemeekrani.*
import kotlinx.android.synthetic.main.activity_personeleklemeekrani.*

class ogrencieklemeekrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ogrencieklemeekrani)
    }
    fun geridon(view: View){
        val intent = Intent(applicationContext,yoneticiekran2::class.java)
        startActivity(intent)

    }


    fun kaydet(view: View){

        val adsoyad = adsoyad2.text.toString()
        val okul = okul2.text.toString()
        val ders = ders2.text.toString()
        val dersgunleri = dersgunleri2.text.toString()
        val derssaatleri = derssaatleri2.text.toString()
        val sinif = sınıf2.text.toString()
        val telno= telno2.text.toString().toInt()
        val velino = velino2.text.toString().toInt()
        val mail = mail2.text.toString()
        val tarih = tarih.text.toString().toInt()


        val ogrenci = ogrenci(adsoyad,okul,ders,dersgunleri,derssaatleri,sinif,telno,velino,mail,tarih)

        val intent = Intent(applicationContext,yoneticiekran2::class.java)
        startActivity(intent)

    }
}