package net.code.gdsc_app.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.code.gdsc_app.R
import net.code.gdsc_app.databinding.FragmentFridayBinding
import net.code.gdsc_app.databinding.FragmentMondayBinding
import net.code.gdsc_app.databinding.FragmentThursdayBinding


class Friday : Fragment() {
    private lateinit var binding:FragmentFridayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_friday, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentFridayBinding.bind(view)

    }


}