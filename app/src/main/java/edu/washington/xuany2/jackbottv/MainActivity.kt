package edu.washington.xuany2.jackbottv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitClicked(view: View) {
        Log.i("hahah", "bbb");

        Toast.makeText(this, "You got mail!", Toast.LENGTH_SHORT).show();
    }
}
