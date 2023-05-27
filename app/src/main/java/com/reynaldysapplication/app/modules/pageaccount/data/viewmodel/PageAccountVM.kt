package com.reynaldysapplication.app.modules.pageaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.reynaldysapplication.app.modules.pageaccount.`data`.model.PageAccountModel
import org.koin.core.KoinComponent

class PageAccountVM : ViewModel(), KoinComponent {
  val pageAccountModel: MutableLiveData<PageAccountModel> = MutableLiveData(PageAccountModel())

  var navArguments: Bundle? = null
}
