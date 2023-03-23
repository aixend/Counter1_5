package com.example.counter

interface CounterView {
    fun updateText(count:String)
    fun changeColor(color: Int)
    fun showToast()
}