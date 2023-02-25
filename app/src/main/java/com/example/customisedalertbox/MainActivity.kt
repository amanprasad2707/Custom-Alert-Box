package com.example.customisedalertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // create a variable of type dialog
    lateinit var dialog: Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton = findViewById<Button>(R.id.btnClick)
        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        // creating variable for the custom_dialogue.xml design
        val buttonNext = dialog.findViewById<Button>(R.id.btnNext)
        val buttonFeedback = dialog.findViewById<Button>(R.id.btnFeedback)

        buttonNext.setOnClickListener {
            dialog.dismiss()
        }
        buttonFeedback.setOnClickListener {
            // intent or toast
            Toast.makeText(this, "feedback submitted", Toast.LENGTH_SHORT).show()
        }

        myButton.setOnClickListener {
            dialog.show()
        }

    }
}