package com.qding.project.config.baselibrary

import android.app.Application

/**
 *  Created by yangyeah on 2021/7/9
 *
 *  describe:
 */
abstract class BaseApplication : Application() {
    abstract fun initModuleApp(a: Application)
    abstract fun initModuleData(a:Application)
}