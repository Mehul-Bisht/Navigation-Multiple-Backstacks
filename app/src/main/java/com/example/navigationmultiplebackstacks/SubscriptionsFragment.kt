package com.example.navigationmultiplebackstacks

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationmultiplebackstacks.databinding.FragmentSubscriptionsBinding

class SubscriptionsFragment : Fragment() {

    private var _binding: FragmentSubscriptionsBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSubscriptionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.gotoSubscriptionNext.setOnClickListener {

            findNavController().navigate(R.id.action_subscriptionsFragment_to_subscriptionsNextFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}