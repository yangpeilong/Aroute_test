package com.qding.project.config.app_module1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main_module1.*

@Route(path = "/module1/main")
class Module1MainActivity : AppCompatActivity() {
    companion object{
        const val  TAG = "Module1MainActivity>>/module1/main"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_module1)
        Log.i(TAG, "onCreate: ")

        btn_jump_to_app_second.setOnClickListener {
            ARouter.getInstance().build("/app/second").navigation()
        }
    }
}