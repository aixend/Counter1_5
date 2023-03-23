package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    var count = 0
    var presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickListener();
    }

    private fun initClickListener() {
        with(binding){
            btnIncrement.setOnClickListener {
               presenter.incrementCount()
            }
            btnDecrement.setOnClickListener {
               presenter.decrementCount()
            }
        }
    }

    override fun updateText(count: String) {
        binding.tvZero.text = count
    }
    override fun changeColor(color: Int) {
        binding.tvZero.setTextColor(color)
    }

    override fun showToast() {
        Toast.makeText(this,"Поздравляю", Toast.LENGTH_SHORT).show()
    }
}