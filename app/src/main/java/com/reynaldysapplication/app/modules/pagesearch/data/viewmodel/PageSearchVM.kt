package com.reynaldysapplication.app.modules.pagesearch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.reynaldysapplication.app.modules.pagesearch.`data`.model.PageSearchModel
import org.koin.core.KoinComponent

class PageSearchVM : ViewModel(), KoinComponent {
  val pageSearchModel: MutableLiveData<PageSearchModel> = MutableLiveData(PageSearchModel())

  var navArguments: Bundle? = null
}
