package com.example.android_material

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_material.extensions.toast
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityButtonsBinding
import com.example.materialdesign.databinding.TopBarActivityBinding

class TopAppBarActivity: AppCompatActivity() {


        private val binding by lazy { TopBarActivityBinding.inflate(layoutInflater) }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            binding.topappbar.setNavigationOnClickListener {
                toast("clicou no menu de navegaçao")
            }

            binding.topappbar.setOnMenuItemClickListener(){
                when(it.itemId){
                    R.id.favorite -> {true }
                    R.id.search -> {true}
                    R.id.more -> {true}
                    else -> false
                }


            }

        }



       companion object{
            fun createIntent(context: Context): Intent = Intent(context, TopAppBarActivity::class.java)
        }



    }
