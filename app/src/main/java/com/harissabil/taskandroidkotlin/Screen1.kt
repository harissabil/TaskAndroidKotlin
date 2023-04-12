package com.harissabil.taskandroidkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.harissabil.taskandroidkotlin.databinding.FragmentScreen1Binding

class Screen1 : Fragment() {

    private var _binding: FragmentScreen1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentScreen1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnScreen2.setOnClickListener {
            val fragmentManager = parentFragmentManager
            fragmentManager.commit {
                addToBackStack(null)
                replace(R.id.fl_container, Screen2())
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}