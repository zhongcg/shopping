package org.jiqiang.shopping

import android.app.Application
import android.content.Context
import com.tencent.mmkv.MMKV

open class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        context = this
        MMKV.initialize(this)

    }


    companion object {
        private var context: BaseApplication? = null
        @JvmStatic
        fun getContext(): Context {
            return context!!
        }
    }
}