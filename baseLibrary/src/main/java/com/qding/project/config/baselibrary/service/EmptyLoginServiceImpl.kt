package com.qding.project.config.baselibrary.service

/**
 *  Created by yangyeah on 2021/7/9
 *
 *  describe:
 */
class EmptyLoginServiceImpl : ILoginService {
    override fun isLogin(): Boolean {
        return false
    }

    override fun getUserId(): String? {
        return null
    }
}