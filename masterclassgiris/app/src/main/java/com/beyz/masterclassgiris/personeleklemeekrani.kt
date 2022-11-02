package com.beyz.masterclassgiris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_personeleklemeekrani.*

class personeleklemeekrani : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personeleklemeekrani)
    }

    fun geridon(view: View){
        val intent = Intent(applicationContext,yoneticiekrani::class.java)
        startActivity(intent)

    }


    fun kaydet(view: View){
        val adsoyad = adsoyad.text.toString()
        val okul = okul.text.toString()
        val bolum = bolum.text.toString()
        val ders = ders.text.toString()
        val telno= telno.text.toString().toInt()
        val mail = mail.text.toString()
        val iban= ıban.text.toString().toInt()
        val tarih = tarih.text.toString().toInt()


        val personel= personel(adsoyad,okul,bolum,ders,telno,mail,iban,tarih)

        val intent = Intent(applicationContext,yoneticiekrani::class.java)
        startActivity(intent)

    }
}