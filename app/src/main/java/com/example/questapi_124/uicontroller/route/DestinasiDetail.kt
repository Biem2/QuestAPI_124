package com.example.questapi_124.uicontroller.route

import com.example.questapi_124.R

object DestinasiDetail : DestinasiNavigasi {
    override val route = "item_details"
    override val titleRes = R.string.detail_siswa
    const val NIM_ARG = "nim"
    val routeWithArgs = "$route/{$NIM_ARG}"
}