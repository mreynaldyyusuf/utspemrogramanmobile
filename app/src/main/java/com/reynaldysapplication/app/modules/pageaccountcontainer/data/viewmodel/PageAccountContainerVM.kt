package com.reynaldysapplication.app.modules.pageaccountcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.reynaldysapplication.app.modules.pageaccountcontainer.`data`.model.PageAccountContainerModel
import org.koin.core.KoinComponent

class PageAccountContainerVM : ViewModel(), KoinComponent {
  val pageAccountContainerModel: MutableLiveData<PageAccountContainerModel> =
      MutableLiveData(PageAccountContainerModel())

  var navArguments: Bundle? = null
}
