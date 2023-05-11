package com.example.productflavours

import LibData
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         Toast.makeText(this@MainActivity,LibData.libVersion(),Toast.LENGTH_SHORT).show()
         LibData.libValues()
        // BuildConfig.BUILD_VARIANT.equals("pro")
    }
}