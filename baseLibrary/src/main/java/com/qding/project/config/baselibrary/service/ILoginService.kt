package com.qding.project.config.baselibrary.service

/**
 *  Created by yangyeah on 2021/7/9
 *
 *  describe:
 */
interface ILoginService {
    fun isLogin(): Boolean
    fun getUserId(): String?
}