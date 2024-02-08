package com.example.supportdifferentscreensizes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//most of the editing is for the layout .xml files
//look at the different screen size settings and different layout files depending on the screen size selected
//also check the layout designs for Portrait and Landscape mode
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}