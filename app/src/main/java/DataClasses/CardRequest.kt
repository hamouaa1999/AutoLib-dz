package com.clovertech.autolibdz.ui.card

import java.io.Serializable

data class CardRequest (
    val number:String,
    val exp_month:String,
    val exp_year:String,
    val cvc:String,

   // val paymentId:String,
  //  val brand:String,
  //  val last4:Int,

   // val card_img:Int

)