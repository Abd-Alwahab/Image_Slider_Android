package com.abdalwahab.imagesslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var images = arrayOf(R.drawable.slide_1,R.drawable.slide_2,R.drawable.slide_3,R.drawable.slide_4)
        var previousBTN = findViewById<Button>(R.id.previous_btn)
        var nextBTN = findViewById<Button>(R.id.next_btn)
        var index = 0




        previousBTN.setOnClickListener {
            if(index == 0) {
                index = images.size
            }
            index--
            imageView.setImageResource(images[index])

        }

        nextBTN.setOnClickListener {
            if(index == images.size -1) {
                index = 0
            }
            index++
            imageView.setImageResource(images[index])

        }



    }
}
