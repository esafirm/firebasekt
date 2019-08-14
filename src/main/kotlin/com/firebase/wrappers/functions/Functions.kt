package com.firebase.wrappers.functions

@JsModule("firebase-functions")
external object Functions {

    fun config(): FunctionConfig

    val https : Https
}