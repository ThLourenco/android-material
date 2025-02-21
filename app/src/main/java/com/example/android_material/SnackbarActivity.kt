package com.example.android_material
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.materialdesign.databinding.ActivitySnackBarBinding
import com.google.android.material.snackbar.Snackbar

class SnackbarActivity : AppCompatActivity() {


    private val binding by lazy { ActivitySnackBarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.showing.setOnClickListener{
            Snackbar.make(it, "Client no primeiro botao", Snackbar.LENGTH_LONG).show()
        }

        binding.action.setOnClickListener{
            Snackbar.make(it, "Client no segundo botao", Snackbar.LENGTH_LONG)
                .setAction("GO"){
                    Log.e("TAG","onCreate: clicou açao")
                }.show()
        }
    }

    companion object{
        fun createIntent(context: Context): Intent = Intent(context, SnackbarActivity::class.java)
    }

}
