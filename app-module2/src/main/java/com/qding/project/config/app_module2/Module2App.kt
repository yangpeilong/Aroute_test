package com.qding.project.config.app_module2

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter
import com.qding.project.config.baselibrary.BaseApplication

/**
 *  Created by yangyeah on 2021/7/9
 *
 *  describe:
 */
class Module2App:BaseApplication() {
    companion object{
        const val TAG = "Module2App"
    }

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "onCreate: init")
        ARouter.init(this)
    }



    override fun initModuleApp(a: Application) {
        Log.i(TAG, "initModuleApp: ")
    }

    override fun initModuleData(a: Application) {
        Log.i(TAG, "initModuleData: ")
    }
}