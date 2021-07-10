package com.qding.project.config.baselibrary.service

import com.alibaba.android.arouter.facade.template.IProvider

/**
 *  Created by yangyeah on 2021/7/10
 *
 *  describe:
 */

// 声明接口,其他组件通过接口来调用服务
interface MyService : IProvider {
    fun getUserId(): String
}