package com.example.android_material

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_material.extensions.toast
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityBottonAppBarBinding
import com.example.materialdesign.databinding.TopBarActivityBinding

class BottonAppBarActivity: AppCompatActivity() {

    private val binding by lazy { ActivityBottonAppBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomAppBar.setNavigationOnClickListener {
            toast("clicou no menu de navegaçao")
        }

        binding.bottomAppBar.setOnMenuItemClickListener(){
            when(it.itemId){
                R.id.favorite -> {true }
                R.id.search -> {true}
                R.id.more -> {true}
                else -> false
            }


        }

    }



    companion object{
        fun createIntent(context: Context): Intent = Intent(context, BottonAppBarActivity::class.java)
    }



}
