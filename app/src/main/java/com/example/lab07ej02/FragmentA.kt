package com.example.lab07ej02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Button

class FragmentA : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        val et1 = view.findViewById<EditText>(R.id.et1)
        val et2 = view.findViewById<EditText>(R.id.et2)
        val bSum = view.findViewById<Button>(R.id.bSum)

        bSum.setOnClickListener {
            val n1 = et1.text.toString().toInt()
            val n2 = et2.text.toString().toInt()

            val res = n1 + n2

            val bundle = Bundle()
            bundle.putInt("resultado", res)
            val fragmentB = FragmentB()
            fragmentB.arguments = bundle

            activity?.supportFragmentManager?.beginTransaction()?.replace(
                R.id.fragmentContainerView2,
                fragmentB
            )?.commit()
        }
        return view
    }
}
