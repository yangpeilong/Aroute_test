package com.qding.project.config.aroute_test.JumpInterceptor

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor

/**
 *  Created by yangyeah on 2021/7/9
 *
 *  describe:
 */
@Interceptor(name = "拦截测试",priority = 2)
class JumpInterceptor : IInterceptor {

    override fun init(context: Context?) {
        Log.i(TAG, "JumpInterceptor  init: ")
    }

    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {

        Log.i(TAG, "process: postcard: before  ==${postcard.toString()}")
        if (postcard?.path == "/app/fourth") {
            postcard.withBoolean("boy",false)
        }

        Log.i(TAG, "process: postcard: after  ==${postcard.toString()}")
        callback?.onContinue(postcard)

        //终止跳转
        //callback?.onInterrupt(null)

        //callback?.onContinue(postcard),onInterrupt()二者必须调用一种

    }

    companion object{
        const val TAG = "JumpInterceptor"
    }

}