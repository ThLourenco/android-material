package com.example.android_material

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.android_material.fragments.HomeFragments
import com.example.android_material.fragments.StartFragments
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityBottomNavigationBinding
import com.example.materialdesign.databinding.ActivityTextFieldsBinding

class BottomNavigationActivity: AppCompatActivity() {


    private val binding by lazy { ActivityBottomNavigationBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId){
                R.id.search -> openFragment(HomeFragments.newInstance())
                R.id.more -> openFragment(StartFragments.newInstance())
            }
            true
        }



    }

    private fun openFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()

    }

    companion object{
        fun createIntent(context: Context): Intent = Intent(context, BottomNavigationActivity::class.java)
    }


}
