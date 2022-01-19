package com.example.customtoastsdk

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.my_custom_toast.performAddition
import com.example.my_custom_toast.showCustomToast

class MainActivity : AppCompatActivity() {

    var context : Context = this;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("10 + 5 ",performAddition(10, 5).toString())

        showCustomToast(context);

    }



}