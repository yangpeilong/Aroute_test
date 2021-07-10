package com.qding.project.config.aroute_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_fourth.*

@Route(path = "/app/fourth")
class FourthActivity : AppCompatActivity() {
    @Autowired
    @JvmField
    var name: String = ""

    @Autowired
    @JvmField
    var age = 0

    @Autowired(name = "boy")
    @JvmField
    var gender = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        ARouter.getInstance().inject(this)
        tv_url.text = "名字叫$name ，年龄$age，性别男 $gender"
    }
}
