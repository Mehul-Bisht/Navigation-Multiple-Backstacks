package com.example.navigationmultiplebackstacks

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationmultiplebackstacks.databinding.FragmentCommonBinding
import com.example.navigationmultiplebackstacks.databinding.FragmentCommonNextBinding

class CommonNextFragment : Fragment() {

    private var _binding: FragmentCommonNextBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCommonNextBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.gotoCommonNextAgain.setOnClickListener {

            findNavController().navigate(R.id.action_commonNextFragment_to_commonNexttFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}