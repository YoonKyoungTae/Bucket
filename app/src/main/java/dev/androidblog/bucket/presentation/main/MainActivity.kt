package dev.androidblog.bucket.presentation.main

import androidx.activity.viewModels
import dev.androidblog.bucket.databinding.ActivityMainBinding
import dev.androidblog.bucket.presentation.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun bindingLayout(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun initView() {
        initFragment()
    }

    private fun initFragment() {
//        supportFragmentManager.commit {
//            add(R.id.clParent, HomeFragment.getInstance(), HomeFragment.TAG)
//        }
    }

    override fun initData() {
        TODO("Not yet implemented")
    }

}