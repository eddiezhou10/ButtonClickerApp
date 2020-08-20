package com.example.buttonclickerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

private var timesClicked = 0 // automatically infers that this is an Int

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickMeClick(view : View){
        //update the click count
        timesClicked++
        // display the current # of clicks on button
        button.setText(timesClicked.toString())
    }
}