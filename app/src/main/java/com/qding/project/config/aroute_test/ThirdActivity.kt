package com.qding.project.config.aroute_test
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter

// URL跳转中间页
class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

//      通过在manifest配置scheme://host，获取Uri（intent.data）
//      将该页面当成中间过渡页跳转到目标path所指向的页面

        Log.i(TAG, "onCreate: intent.data === ${intent.data}")
        ARouter.getInstance().build(intent.data).navigation(this, object : NavigationCallback {
            override fun onLost(postcard: Postcard?) {
                Log.e(TAG, "onLost,postcard == ${postcard.toString()}")
            }

            override fun onFound(postcard: Postcard?) {
                Log.e(TAG, "onFound")
            }

            override fun onInterrupt(postcard: Postcard?) {
                Log.e(TAG, "onInterrupt")
            }

            override fun onArrival(postcard: Postcard?) {
                    //uri=test://qding.com/app/fourth?name=alex&age=18&boy=true,
                    // tag=null,
                    // mBundle=Bundle[{
                    // NTeRQWvye18AkPd6G=test://qding.com/app/fourth?name=alex&age=18&boy=true,
                    // age=18, boy=true, name=alex, wmHzgD4lOj5o4241=[Ljava.lang.String;@c2064c1}],
                    // flags=-1, timeout=300, provider=null, greenChannel=false,
                    // optionsCompat=null, enterAnim=-1, exitAnim=-1
                    // }
                    //RouteMeta{type=ACTIVITY,
                    //rawType=null,
                    //destination=class com.qding.project.config.aroute_test.FourthActivity,
                    //path='/app/fourth',
                    //group='app',
                    //priority=-1,
                    //extra=-2147483648, p
                    //aramsType=null,
                    //name='null'

                    Log.e(TAG, "onArrival,postcard == ${postcard.toString()}")
                    finish()
            }

        })
    }

    companion object{
        const val TAG = "ThirdActivity"
    }
}
