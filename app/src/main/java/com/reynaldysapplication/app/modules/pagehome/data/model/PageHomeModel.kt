package com.reynaldysapplication.app.modules.pagehome.`data`.model

import com.reynaldysapplication.app.R
import com.reynaldysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PageHomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDonasiKorbanB: String? =
      MyApp.getInstance().resources.getString(R.string.msg_donasi_korban_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kampung_pulo_sa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAyoBantuKorba: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ayo_bantu_korba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_warga_yogya_saa)

)
