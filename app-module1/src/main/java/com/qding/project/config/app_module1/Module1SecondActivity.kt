package com.qding.project.config.app_module1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

@Route(path = "/module1/second")
class Module1SecondActivity : AppCompatActivity() {

    companion object{
        const val  TAG = "Module1SecondActivity>>/module1/second"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_module1)
        ARouter.getInstance().inject(this)

        Log.i(TAG, "onCreate:")
    }
}