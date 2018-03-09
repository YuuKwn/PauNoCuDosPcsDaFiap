package com.cha.yuukwn.paunocudospcsdafiap

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class CharActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_char)

        btCriar.setOnClickListener{
Toast.makeText(this, "Usuário criado", Toast.LENGTH_SHORT)
        .show()
        }
    }
}
