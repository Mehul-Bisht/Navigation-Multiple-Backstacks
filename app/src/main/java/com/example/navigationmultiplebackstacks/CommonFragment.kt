package com.example.navigationmultiplebackstacks

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationmultiplebackstacks.databinding.FragmentCommonBinding

class CommonFragment : Fragment() {

    private var _binding: FragmentCommonBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCommonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.gotoCommonNext.setOnClickListener {

            findNavController().navigate(R.id.action_commonFragment_to_commonNextFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}