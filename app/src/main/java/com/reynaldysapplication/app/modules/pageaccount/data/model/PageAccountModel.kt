package com.reynaldysapplication.app.modules.pageaccount.`data`.model

import com.reynaldysapplication.app.R
import com.reynaldysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PageAccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAbrahamSamad: String? = MyApp.getInstance().resources.getString(R.string.lbl_abraham_samad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonasiSelesai: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_donasi_selesai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_28)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalDonasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_donasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRp508000: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_508_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEightValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThreeValue: String? = null
)
