package com.reynaldysapplication.app.modules.pagehome.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.reynaldysapplication.app.R
import com.reynaldysapplication.app.appcomponents.base.BaseActivity
import com.reynaldysapplication.app.databinding.ActivityPageHomeBinding
import com.reynaldysapplication.app.modules.pagehome.`data`.viewmodel.PageHomeVM
import com.reynaldysapplication.app.modules.pagesearch.ui.PageSearchActivity
import kotlin.String
import kotlin.Unit

class PageHomeActivity : BaseActivity<ActivityPageHomeBinding>(R.layout.activity_page_home) {
  private val viewModel: PageHomeVM by viewModels<PageHomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pageHomeVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = PageSearchActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "PAGE_HOME_ACTIVITY"

    }
  }
