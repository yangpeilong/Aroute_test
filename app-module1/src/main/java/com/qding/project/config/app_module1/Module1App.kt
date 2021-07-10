package com.qding.project.config.app_module1

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter
import com.qding.project.config.baselibrary.BaseApplication
import com.qding.project.config.baselibrary.service.ILoginService
import com.qding.project.config.baselibrary.service.ServiceFactory

/**
 *  Created by yangyeah on 2021/7/9
 *
 *  describe:
 */
class Module1App:BaseApplication() {
    companion object{
        const val TAG = "Module1App"
    }

    override fun onCreate() {
        super.onCreate()
        ARouter.init(this)
        Log.i(TAG, "onCreate: init")
    }
    override fun initModuleApp(a: Application) {
        Log.i(TAG, "initModuleApp: ")
        ServiceFactory.loginService  =  object :ILoginService{
            override fun isLogin(): Boolean {
                return true
            }

            override fun getUserId(): String? {
               return "1234567890"
            }

        }
    }

    override fun initModuleData(a: Application) {
        Log.i(TAG, "initModuleData: ")
    }
}