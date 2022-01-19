package com.example.my_custom_toast

import android.widget.Toast

import android.view.Gravity

import android.content.Context

import android.widget.TextView

import android.view.View

import android.view.LayoutInflater




fun performAddition(a:Int, b:Int) : Int {
    return  a+b;
}

fun showCustomToast(context: Context){
//    val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//    val layout: View = inflater.inflate(
//        com.example.my_custom_toast.R.layout.custom_toast_layout, null
//        findViewById(com.example.my_custom_toast.R.id.toast_layout_root) as ViewGroup?
//    )


//    val text = layout.findViewById<View>(com.example.my_custom_toast.R.id.toast_text) as TextView
//    text.text = "Hello! This is a custom toast!"

    val toast = Toast.makeText(context, "Hello! This is a custom toast!", Toast.LENGTH_LONG)
//    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
//    toast.duration = Toast.LENGTH_LONG
//    toast.ma(layout)
    toast.show()
}