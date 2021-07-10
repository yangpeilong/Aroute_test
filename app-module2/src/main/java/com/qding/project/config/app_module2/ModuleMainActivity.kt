package com.qding.project.config.app_module2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.qding.project.config.baselibrary.service.MyService
import kotlinx.android.synthetic.main.activity_main_module2.*

@Route(path = "/module2/main")
class ModuleMainActivity : AppCompatActivity() {

    @JvmField
    @Autowired
    var id :String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_module2)
        ARouter.getInstance().inject(this)


        tv.text = String.format("received data: id = %s",id)


        btn_jump_to_module1_second.setOnClickListener {
            ARouter.getInstance().build("/module1/second").navigation()
        }


        btn_find_service.setOnClickListener {
            val myService = ARouter.getInstance().build("/service/my").navigation() as MyService
            myService.getUserId()
            tv.text = String.format("received data: myUserId  = %s",myService.getUserId())
        }

    }
}