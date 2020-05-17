package com.sunnyweather.android.logic.dao

import android.annotation.SuppressLint
import android.content.Context
import com.google.gson.Gson
import com.sunnyweather.android.App
import com.sunnyweather.android.logic.model.Place

object PlaceDao {

    @SuppressLint("ApplySharedPref")
    fun savePlace(place: Place){
       val edit = sharedPreferences().edit().apply {
           putString("place", Gson().toJson(place))
           commit()
       }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        App.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)

}