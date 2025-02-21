package com.example.android_material
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.materialdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        insertListeners()
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

        binding.cardViewTopAppBars.setOnClickListener({
            startActivity(TopAppBarActivity.createIntent(this))
        })

        binding.cardBottonAppbar.setOnClickListener({
            startActivity(BottonAppBarActivity.createIntent(this))
        })

        binding.cardSnackbar.setOnClickListener({
            startActivity(SnackbarActivity.createIntent(this))
        })
    }

}