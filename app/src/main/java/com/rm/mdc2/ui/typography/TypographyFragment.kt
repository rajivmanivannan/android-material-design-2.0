package com.rm.mdc2.ui.typography

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.rm.mdc2.databinding.FragmentTypographyBinding

class TypographyFragment : Fragment() {

  private lateinit var typographyViewModel: TypographyViewModel
  private var _binding: FragmentTypographyBinding? = null

  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    typographyViewModel =
      ViewModelProvider(this).get(TypographyViewModel::class.java)

    _binding = FragmentTypographyBinding.inflate(inflater, container, false)
    val root: View = binding.root

    typographyViewModel.text.observe(viewLifecycleOwner, Observer {
    })
    return root
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}