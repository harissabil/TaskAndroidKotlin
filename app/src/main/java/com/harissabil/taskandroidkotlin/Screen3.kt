package com.harissabil.taskandroidkotlin

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import com.harissabil.taskandroidkotlin.Data.alamat
import com.harissabil.taskandroidkotlin.Data.pekerjaan
import com.harissabil.taskandroidkotlin.Data.umur
import com.harissabil.taskandroidkotlin.databinding.FragmentScreen1Binding
import com.harissabil.taskandroidkotlin.databinding.FragmentScreen3Binding

class Screen3 : Fragment() {

    private var _binding: FragmentScreen3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentScreen3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnScreen4.setOnClickListener {
            parentFragmentManager.commit {
                addToBackStack(null)
                replace(R.id.fl_container, Screen4())
            }
        }
        binding.tvDetail.text = "${Data.nama}\n${Data.umur}${Data.oddOrEven}\n${Data.alamat}\n${Data.pekerjaan}"
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}