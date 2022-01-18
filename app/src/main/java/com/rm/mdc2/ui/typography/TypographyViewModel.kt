package com.rm.mdc2.ui.typography

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TypographyViewModel : ViewModel() {

  private val _text = MutableLiveData<String>().apply {
    value = "This is Typography Fragment"
  }
  val text: LiveData<String> = _text
}