package com.qding.project.config.aroute_test

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter
import com.qding.project.config.baselibrary.BaseApplication

/**
 *  Created by yangyeah on 2021/7/9
 *
 *  describe:
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)

        Log.i(TAG, "onCreate: ")
        initModule()
        initModuleData()

    }

    private fun initModule() {
        for (className in classNames) {
            val clazz = Class.forName(className)
            val app = clazz.newInstance() as BaseApplication
            app.initModuleApp(this)
        }
    }

    private fun initModuleData() {
        for (className in classNames) {
            val clazz = Class.forName(className)
            val app = clazz.newInstance() as BaseApplication
            app.initModuleData(this)
        }
    }

    companion object{

        const val TAG = "App"
        const val app_module1 = "com.qding.project.config.app_module1.Module1App"
        const val app_module2 = "com.qding.project.config.app_module2.Module2App"

        val classNames = arrayOf(app_module1, app_module2)
    }
}