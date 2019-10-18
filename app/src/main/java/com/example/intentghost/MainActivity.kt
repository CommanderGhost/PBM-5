package com.example.intentghost

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentghost.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val id:Int = 10
    val language:String = "kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttona1.setOnClickListener() {
                intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("id_value", id)
                    intent.putExtra("language_value", language)
            startActivity(intent)
        }
    }
}
