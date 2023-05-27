package com.reynaldysapplication.app.modules.pageaccount.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.reynaldysapplication.app.R
import com.reynaldysapplication.app.appcomponents.base.BaseFragment
import com.reynaldysapplication.app.databinding.FragmentPageAccountBinding
import com.reynaldysapplication.app.modules.pageaccount.`data`.viewmodel.PageAccountVM
import kotlin.String
import kotlin.Unit

class PageAccountFragment : BaseFragment<FragmentPageAccountBinding>(R.layout.fragment_page_account)
    {
  private val viewModel: PageAccountVM by viewModels<PageAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.pageAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PAGE_ACCOUNT_FRAGMENT"


    fun getInstance(bundle: Bundle?): PageAccountFragment {
      val fragment = PageAccountFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
