package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class TranslateActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translate)

        val text = findViewById<TextView>(R.id.binaryNumber);
        val editText = findViewById<EditText>(R.id.editTextNumber);
        val radioR1 = findViewById<RadioButton>(R.id.type1);
        val radioR2 = findViewById<RadioButton>(R.id.type2);
        val radioR3 = findViewById<RadioButton>(R.id.type3);
        val buttonTranslate = findViewById<Button>(R.id.translate);
        val result = findViewById<EditText>(R.id.result);
        buttonTranslate.setOnClickListener { view: View ->
            val abouts = Intent(this, AboutActivity::class.java);
            startActivity(abouts);
        }

    }
}