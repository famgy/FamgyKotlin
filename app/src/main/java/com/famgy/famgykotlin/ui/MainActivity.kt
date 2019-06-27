package com.famgy.famgykotlin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.famgy.famgykotlin.R
import com.famgy.famgykotlin.ui.menu.ChooseMenuFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.container, ChooseMenuFragment()).commit()
    }
}
