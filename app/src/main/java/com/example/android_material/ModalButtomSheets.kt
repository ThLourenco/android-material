package com.example.android_material

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.android_material.databinding.ButtomSheetModelBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ModalButtomSheets : BottomSheetDialogFragment() {

    private val binding by lazy {
        ButtomSheetModelBinding.inflate(LayoutInflater.from(requireContext()))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  binding.root
    }

    companion object{
        private  const val TAG = ""

        fun start(manager: FragmentManager){
            ModalButtomSheets().show(manager, TAG)
        }
    }


}