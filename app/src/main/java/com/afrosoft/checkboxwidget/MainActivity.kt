package com.afrosoft.checkboxwidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onCheckBoxClicked(view: View){
        Log.d("Checks","CheckBox Clicked")
        view as CheckBox //casting our view as a Checkbox object or type or view
        var isChecked: Boolean = view.isChecked
        when(view.id){
            R.id.checkVeggies -> if(isChecked){ Log.d("Veggies", "IsChecked")}
            R.id.checkMeat -> if(isChecked){ Log.d("Meat","IsChecked")}
            R.id.checkFruit -> if(isChecked){ Log.d("Fruit","IsChecked")}
        }
    }
}