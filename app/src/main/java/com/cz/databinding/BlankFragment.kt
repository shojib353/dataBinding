package com.cz.databinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.cz.databinding.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {

    lateinit var dataBinding: FragmentBlankBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_blank,container,false)

        val viewM=ViewModelProvider(this).get(MainViewModel::class.java)

        dataBinding.datta=viewM


        return dataBinding.root

    }


}