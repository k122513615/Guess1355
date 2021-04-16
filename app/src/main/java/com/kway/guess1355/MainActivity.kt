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
    val Tag =  MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView(R.layout.linear_main)
        Log.d( Tag, "Secrect:" + serectNumber.sercret)
    }

    fun Check(View : View){
        val  n = ed_num.text.toString().toInt()
        println("Number:$n")
        Log.d( Tag, "Number:"+n)

        val diff = serectNumber.validate(n)
        var msg = getString(R.string.YES_YOU_GOT_IT)
        if(diff<0)
            msg = getString(R.string.Bigger)
        else if(diff >0)
            msg = getString(R.string.Lowwer)

//        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setTitle(getString(R.string.Message))
            .setMessage(msg)
            .setPositiveButton(getString(R.string.MainActivity_OK),null)
            .show()
    }
}