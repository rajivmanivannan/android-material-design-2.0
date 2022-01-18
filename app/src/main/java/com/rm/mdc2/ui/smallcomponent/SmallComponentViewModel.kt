package com.rm.mdc2.ui.smallcomponent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SmallComponentViewModel : ViewModel() {

  private val _text = MutableLiveData<String>().apply {
    value = "This is Small Component Fragment"
  }
  val text: LiveData<String> = _text
}