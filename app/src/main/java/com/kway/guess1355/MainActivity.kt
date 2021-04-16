package com.kway.guess1355

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val serectNumber = SerectNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView(R.layout.linear_main)
        Log.d( "MainActivity", "Secrect:" + serectNumber.sercret)
    }

    fun Check(View : View){
        val  n = ed_num.text.toString().toInt()
        println("Number:$n")
        Log.d( "MainActivity", "Number:"+n)

        val diff = serectNumber.validate(n)
        var msg = "you are right"
        if(diff<0)
            msg = "Bigger"
        else if(diff >0)
            msg = "Lowwer"

//        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setTitle("Message")
            .setMessage(msg)
            .setPositiveButton("OK",null)
            .show()
    }
}