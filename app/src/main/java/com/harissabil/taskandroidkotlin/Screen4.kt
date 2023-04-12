package com.harissabil.taskandroidkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.harissabil.taskandroidkotlin.databinding.FragmentScreen4Binding

class Screen4 : Fragment() {

    private var _binding: FragmentScreen4Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentScreen4Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnScreen3.setOnClickListener {
            parentFragmentManager.commit {
                val umur = binding.etUsia.text.toString().trim()
                val alamat = binding.etAlamat.text.toString().trim()
                val pekerjaan = binding.etPekerjaan.text.toString().trim()

                if (umur.isEmpty()) {
                    binding.etUsia.error = "Mohon diisi"
                }
                else if (alamat.isEmpty()) {
                    binding.etAlamat.error = "Mohon diisi"
                }
                else if (pekerjaan.isEmpty()) {
                    binding.etPekerjaan.error = "Mohon diisi"
                }
                else {
                    if (umur.toInt() % 2 == 0) {
                        Data.oddOrEven = ", bernilai Genap"
                    } else {
                        Data.oddOrEven = ", bernilai Ganjil"
                    }

                    Data.umur = umur
                    Data.alamat = alamat
                    Data.pekerjaan = pekerjaan
                    replace(R.id.fl_container, Screen3())
                }
            }
        }
    }
}