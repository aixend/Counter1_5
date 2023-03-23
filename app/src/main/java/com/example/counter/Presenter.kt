package com.example.counter

import android.graphics.Color

class Presenter {

     var model = CounterModel()
     lateinit var view: CounterView

     fun incrementCount(){
          model.increment()
          view.updateText(model.count.toString())
          if (model.count == 10) {
               view.showToast()
          }
          if (model.count == 15) {
               view.changeColor(Color.GREEN)
          }
     }
     fun decrementCount(){
          model.decrement()
          view.updateText(model.count.toString())
          if (model.count == 10) {
               view.showToast()
          }
          if (model.count < 15) {
               view.changeColor(Color.BLACK)
          }
     }
     fun attachView(view: CounterView){
          this.view = view
   }
}