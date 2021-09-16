package com.cuongtd.sedaily.data.network

import android.content.Context
import com.cuongtd.sedaily.utils.isConnected

class NetworkManager(private val applicationContext: Context) {
    val isConnected: Boolean
        get() = applicationContext.isConnected

}