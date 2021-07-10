package com.qding.project.config.aroute_test.service

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.qding.project.config.baselibrary.service.MyService

/**
 *  Created by yangyeah on 2021/7/10
 *
 *  describe:
 */

@Route(path = "/service/my", name = "测试服务")
class MyServiceImpl : MyService {
    override fun getUserId(): String {
        return "12345678"
    }

    override fun init(context: Context?) {
        Log.i(TAG, "init: ")
    }

    companion object {
        const val TAG = "MyServiceImpl"
    }
}