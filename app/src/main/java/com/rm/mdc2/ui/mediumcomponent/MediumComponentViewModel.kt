package com.rm.mdc2.ui.mediumcomponent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MediumComponentViewModel : ViewModel() {

  private val _text = MutableLiveData<String>().apply {
    value = "This is Medium Component Fragment"
  }
  val text: LiveData<String> = _text
}