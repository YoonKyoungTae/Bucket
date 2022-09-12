package dev.androidblog.bucket.presentation.splash

import android.content.Intent
import dev.androidblog.bucket.databinding.ActivitySplashBinding
import dev.androidblog.bucket.presentation.base.BaseActivity
import dev.androidblog.bucket.presentation.main.MainActivity

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override fun bindingLayout() = ActivitySplashBinding.inflate(layoutInflater)

    override fun initView() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

}