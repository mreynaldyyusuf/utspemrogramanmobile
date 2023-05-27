package com.reynaldysapplication.app.modules.pagesearch.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.reynaldysapplication.app.R
import com.reynaldysapplication.app.appcomponents.base.BaseActivity
import com.reynaldysapplication.app.databinding.ActivityPageSearchBinding
import com.reynaldysapplication.app.modules.pagesearch.`data`.viewmodel.PageSearchVM
import kotlin.String
import kotlin.Unit

class PageSearchActivity : BaseActivity<ActivityPageSearchBinding>(R.layout.activity_page_search) {
  private val viewModel: PageSearchVM by viewModels<PageSearchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pageSearchVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PAGE_SEARCH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PageSearchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
