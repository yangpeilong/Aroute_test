package com.qding.project.config.aroute_test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

/**
 *  Created by yangyeah on 2021/7/9
 *
 *  describe:
 */
@Route(path = "/app/second")
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        ARouter.getInstance().inject(this)
    }
}