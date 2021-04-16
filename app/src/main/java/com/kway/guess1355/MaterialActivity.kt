package com.kway.guess1355

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_material.*
import kotlinx.android.synthetic.main.content_material.*

class MaterialActivity : AppCompatActivity() {
    val serectNumber = SerectNumber()
    val Tag =  MaterialActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material)
        setSupportActionBar(findViewById(R.id.toolbar))

        fab.setOnClickListener { view ->
            AlertDialog.Builder(this)
                .setTitle("Replay")
                .setMessage("are you sure")
                .setPositiveButton(getString(R.string.app_ok), { dialog, which ->
                    serectNumber.reset()
                    counter.setText(serectNumber.count.toString())
                    ed_num.setText("")
                })
                .setNeutralButton("Cancel",null)
                .show()
        }
        counter.setText(serectNumber.count.toString())
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
