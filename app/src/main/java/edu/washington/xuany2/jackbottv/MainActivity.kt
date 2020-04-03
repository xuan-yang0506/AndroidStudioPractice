package edu.washington.xuany2.jackbottv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var randomCode: Int = Random.nextInt(1000, 10000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvRandomCode.text = tvRandomCode.toString()

        val tvRandomCode : TextView = findViewById<TextView>(R.id.tvRandomCode);
        tvRandomCode.text = randomCode.toString()

        btnCancel.setOnClickListener { btnCancelBtn: View ->
            cancelButtonClicked(btnCancelBtn)
        }
    }

    private fun cancelButtonClicked(view: View) {
        etCode.text.clear()
    }

    fun submitClicked(view: View) {

        val etCodeText : String = etCode.text.toString()

        if (etCodeText.isNotEmpty()) {
            if (etCodeText == randomCode.toString()) {
                Toast.makeText(this, "Name: You're in", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
