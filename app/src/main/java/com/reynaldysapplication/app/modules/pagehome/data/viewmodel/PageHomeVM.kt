package com.reynaldysapplication.app.modules.pagehome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.reynaldysapplication.app.modules.pagehome.`data`.model.PageHomeModel
import org.koin.core.KoinComponent

class PageHomeVM : ViewModel(), KoinComponent {
  val pageHomeModel: MutableLiveData<PageHomeModel> = MutableLiveData(PageHomeModel())

  var navArguments: Bundle? = null
}
