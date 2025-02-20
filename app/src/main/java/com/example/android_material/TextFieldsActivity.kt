package com.example.android_material

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.materialdesign.databinding.ActivityTextFieldsBinding

class TextFieldsActivity: AppCompatActivity() {

    private val binding by lazy { ActivityTextFieldsBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imputErro.error = "Campo obrigatorio"

    }

    companion object{
        fun createIntent(context: Context): Intent = Intent(context, ActivityTextFieldsBinding::class.java)
    }



}
