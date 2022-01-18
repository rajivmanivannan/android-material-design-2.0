package com.rm.mdc2.ui.mediumcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.rm.mdc2.databinding.FragmentMediumComponentBinding

class MediumComponentFragment : Fragment() {

  private lateinit var mediumComponentViewModel: MediumComponentViewModel
  private var _binding: FragmentMediumComponentBinding? = null

  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    mediumComponentViewModel =
      ViewModelProvider(this).get(MediumComponentViewModel::class.java)

    _binding = FragmentMediumComponentBinding.inflate(inflater, container, false)
    val root: View = binding.root

    mediumComponentViewModel.text.observe(viewLifecycleOwner, Observer {
    })
    return root
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}