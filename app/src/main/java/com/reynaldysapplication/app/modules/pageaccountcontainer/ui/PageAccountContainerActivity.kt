package com.reynaldysapplication.app.modules.pageaccountcontainer.ui

import androidx.activity.viewModels
import com.reynaldysapplication.app.R
import com.reynaldysapplication.app.appcomponents.base.BaseActivity
import com.reynaldysapplication.app.databinding.ActivityPageAccountContainerBinding
import com.reynaldysapplication.app.extensions.loadFragment
import com.reynaldysapplication.app.modules.pageaccount.ui.PageAccountFragment
import com.reynaldysapplication.app.modules.pageaccountcontainer.`data`.viewmodel.PageAccountContainerVM
import kotlin.String
import kotlin.Unit

class PageAccountContainerActivity :
    BaseActivity<ActivityPageAccountContainerBinding>(R.layout.activity_page_account_container) {
  private val viewModel: PageAccountContainerVM by viewModels<PageAccountContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pageAccountContainerVM = viewModel
    val destFragment = PageAccountFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = PageAccountFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnvectorTwo.setOnClickListener {
      val destFragment = PageAccountFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = PageAccountFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "PAGE_ACCOUNT_CONTAINER_ACTIVITY"

  }
}
