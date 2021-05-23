package com.example.navigationmultiplebackstacks

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationmultiplebackstacks.databinding.FragmentSubscriptionsBinding
import com.example.navigationmultiplebackstacks.databinding.FragmentSubscriptionsNextBinding

class SubscriptionsNextFragment : Fragment() {

    private var _binding: FragmentSubscriptionsNextBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSubscriptionsNextBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("SubsFrag ","onViewCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}