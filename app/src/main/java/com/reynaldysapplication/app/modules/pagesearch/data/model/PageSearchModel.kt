package com.reynaldysapplication.app.modules.pagesearch.`data`.model

import com.reynaldysapplication.app.R
import com.reynaldysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PageSearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLingkungan: String? = MyApp.getInstance().resources.getString(R.string.lbl_lingkungan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBantuanMedis: String? = MyApp.getInstance().resources.getString(R.string.lbl_bantuan_medis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInfrastruktur: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_infrastruktur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBalita: String? = MyApp.getInstance().resources.getString(R.string.lbl_balita)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDifabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_difabel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZakat: String? = MyApp.getInstance().resources.getString(R.string.lbl_zakat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHewan: String? = MyApp.getInstance().resources.getString(R.string.lbl_hewan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRumahIbadah: String? = MyApp.getInstance().resources.getString(R.string.lbl_rumah_ibadah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPantiAsuhan: String? = MyApp.getInstance().resources.getString(R.string.lbl_panti_asuhan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchBoxValue: String? = null
)
