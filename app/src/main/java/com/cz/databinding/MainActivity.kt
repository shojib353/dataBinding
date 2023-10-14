package com.cz.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.cz.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
            val viewModell=ViewModelProvider(this).get(MainViewModel::class.java)

        binding.main=viewModell
        supportFragmentManager.beginTransaction().replace(R.id.frame,BlankFragment()).commit()

    }
}