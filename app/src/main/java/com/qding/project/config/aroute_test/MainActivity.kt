package com.qding.project.config.aroute_test

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.qding.project.config.baselibrary.service.ServiceFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_jump_module1_main.setOnClickListener {
            ARouter.getInstance().build("/module1/main").navigation()
        }

        btn_jump_module2_main.setOnClickListener {

            ARouter.getInstance()
                .build("/module2/main")
                .withString("id","123456")
                .navigation()

//            if (ServiceFactory.loginService!!.isLogin() && ServiceFactory.loginService!!.getUserId() == "1234567890") {
//                ARouter.getInstance()
//                    .build(Uri.parse("/module2/main"))
//                    .withString("id", "this is a jump>>> id:8888")
//                    .navigation()
//            }
        }

        webview.loadDataWithBaseURL(null, htmls,"text/html","utf-8",null)
    }

    companion object{
        const val htmls =   """<a href="test://qding.com/app/fourth?name=alex&age=18&boy=true">test://qding.com/app/fourth?name=alex&age=18&boy=true</a></p>"""
    }
}