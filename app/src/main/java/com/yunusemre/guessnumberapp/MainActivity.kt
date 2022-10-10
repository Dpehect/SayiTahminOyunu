package com.yunusemre.guessnumberapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.yunusemre.guessnumberapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val secilensayi = binding.secilensayitext.text.toString()
        val min = 1
        val max = 10
        val randomsayi = (0 until 11).random() //Double
        var asilsayi = randomsayi.toString()

        binding.guessbutton.setOnClickListener {
            if(secilensayi.toString() == asilsayi){
                Toast.makeText(this, "Tebrikler", Toast.LENGTH_SHORT).show()
                asilsayi = randomsayi.toString()
            }
            else if(secilensayi.toString() != randomsayi.toString()){
                Toast.makeText(this, "Tekrar Deneyiniz", Toast.LENGTH_SHORT).show()
            }
        }



    }
}