package com.qding.project.config.baselibrary.service

/**
 *  Created by yangyeah on 2021/7/9
 *
 *  describe:
 */
object ServiceFactory {

    var loginService: ILoginService? = null
        get() {
            if (field == null) {
                loginService = EmptyLoginServiceImpl()
            }
            return field
        }
}