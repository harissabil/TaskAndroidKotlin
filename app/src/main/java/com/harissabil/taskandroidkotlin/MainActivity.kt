package com.harissabil.taskandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.harissabil.taskandroidkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_container, Screen1())
            addToBackStack(null)
            commit()
        }
    }
}