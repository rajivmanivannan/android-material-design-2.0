package com.rm.mdc2.ui.smallcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.rm.mdc2.databinding.FragmentSmallComponentBinding

class SmallComponentFragment : Fragment() {

  private lateinit var smallComponentViewModel: SmallComponentViewModel
  private var _binding: FragmentSmallComponentBinding? = null

  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    smallComponentViewModel =
      ViewModelProvider(this)[SmallComponentViewModel::class.java]

    _binding = FragmentSmallComponentBinding.inflate(inflater, container, false)
    val root: View = binding.root

    smallComponentViewModel.text.observe(viewLifecycleOwner, Observer {

    })
    return root
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}