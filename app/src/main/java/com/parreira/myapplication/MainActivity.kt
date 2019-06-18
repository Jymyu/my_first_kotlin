package com.parreira.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

     private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById (R.id.text_view_example1)
        print("\nYour Fortune is: ${getFortune()}")
    }

    private fun print(string : String) {

        var hour = string

        textView.text = hour


    }

    private fun getFortune() : String{

        val fortunes = listOf("a", "b", "c", "d")
        val birthday =  1
        return fortunes[birthday.rem(fortunes.size)]
    }
}
