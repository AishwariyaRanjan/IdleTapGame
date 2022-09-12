package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    var counter =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add_button = findViewById<Button>(R.id.add_button)
        val counter_textView = findViewById<TextView>(R.id.counter_textView)
        val upgradeButton = findViewById<Button>(R.id.upgradeButton)

        var increaseBy = 1

        add_button.setOnClickListener{
            counter+=increaseBy
            counter_textView.text = counter.toString()

            if (counter == 10 || counter == 100 ){
                upgradeButton.visibility = View.VISIBLE
                //or upgradeButton.isVisible = true
            }
        }

        upgradeButton.setOnClickListener{
            if(counter>=10 && counter <100){
                increaseBy+=1
            }
            if(counter>=100){
                add_button.setBackgroundResource(R.drawable.cat_paw)
                add_button.text = " "
                increaseBy+=2
            }

            upgradeButton.isVisible = false
        }
    }
}