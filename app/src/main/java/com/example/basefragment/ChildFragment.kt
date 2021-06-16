package com.example.basefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.basefragment.databinding.FragmentChildBinding

class ChildFragment : BaseFragment<FragmentChildBinding, FragmentViewModel>(
    FragmentChildBinding::inflate
) {
    override fun start(inflater: LayoutInflater, container: ViewGroup?) {
        init()
    }

    private fun init() {

    }

    override fun getViewModel() = FragmentViewModel::class.java

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text = "WOW"
    }

}