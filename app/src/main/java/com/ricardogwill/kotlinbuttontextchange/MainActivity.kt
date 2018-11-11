package com.ricardogwill.kotlinbuttontextchange

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textChangeB.setOnClickListener {

            if (textChangeB.text.equals("Click to change text")) {
                textChangeB.text = "Click to revert text"
            } else {
                textChangeB.text = "Click to change text"
            }

        }


    }
}
