package com.example.android_material

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.android_material.databinding.ActivityMainBinding
import com.example.android_material.databinding.ButtomSheetModelBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun insertListeners(){
        binding.cardViewButtons.setOnClickListener({
            startActivity(ButtonsActivity.createIntent(this))
        })

        binding.cardViewTxtFields.setOnClickListener({
            startActivity(TextFieldsActivity.createIntent(this))
        })

        binding.cardViewButtomSheets.setOnClickListener({
         ModalButtomSheets.start(supportFragmentManager)
        })
    }

}