package com.aliardal.kullanicigirissayfasi

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_kayit_ol.*

class MainKayitOl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kayit_ol)
    }
    fun girisedon(view: View){
        intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }
    fun kaydet(view: View){
        var kullaniciBilgisi = kayitKullaniciAdi.text.toString()
        var kullaniciParola = kayitParola.text.toString()
        var SharedPreferences = this.getSharedPreferences("bilgiler", MODE_PRIVATE)
        var Editor = SharedPreferences.edit()

        // veri ekleme
        Editor.putString("kullanici","$kullaniciBilgisi").apply()
        Editor.putString("parola","$kullaniciParola").apply()
        Toast.makeText(this, "Kayıt Başarılı", Toast.LENGTH_SHORT).show()
        kayitKullaniciAdi.text.clear()
        kayitParola.text.clear()
        

    }
}