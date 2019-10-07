package com.airmineral.newkotlinapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textV.text = getString(R.string.welcomeText, number)
        btnTap.setOnTouchListener(RepeatListener(500, 10, View.OnClickListener {
            tambah()
        }))
    }

    private fun tambah() {
        number++
        textV.text = getString(R.string.welcomeText, number)
    }
}
