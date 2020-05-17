package com.sunnyweather.android

import android.app.Application
import android.content.Context

class App : Application(){

    companion object{

        lateinit var context : Context
        /**
         *  彩云密令
         */
        const val TOKEN = "qZtCGnPegnHBAUzW"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

    }
}