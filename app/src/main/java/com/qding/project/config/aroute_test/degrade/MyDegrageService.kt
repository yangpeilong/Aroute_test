package com.qding.project.config.aroute_test.degrade

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.DegradeService

/**
 *  Created by yangyeah on 2021/7/10
 *
 *  describe:
 */
//降级策略其实就是在跳转过程中，如果出现错误的话，可以进行处理跳转。 方法有两种，
// 一个是处理单个跳转，一个是全局的跳转处理。
//path 内容可任意
@Route(path = "/a/b")
class MyDegrageService:DegradeService {
    override fun init(context: Context?) {
        Log.i(TAG, "init: 全局降级策略的初始化过程")
    }

    override fun onLost(context: Context?, postcard: Postcard?) {
        Log.i(TAG, "onLost: path = ${postcard?.path}")
    }

    companion object{
        const val TAG = "MyDegrageService"
    }
}