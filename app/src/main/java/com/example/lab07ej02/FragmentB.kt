package com.example.lab07ej02

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView

class FragmentB : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val resTV = view.findViewById<TextView>(R.id.resultado)

        val bundle = arguments
        val res = bundle?.getInt("resultado")
        resTV.text = "La suma es " + res.toString()
        return view
    }
}
