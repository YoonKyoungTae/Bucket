package dev.androidblog.bucket.presentation.main

import androidx.activity.viewModels
import dev.androidblog.bucket.core.extensions.safe
import dev.androidblog.bucket.databinding.ActivityMainBinding
import dev.androidblog.bucket.presentation.base.BaseActivity
import dev.androidblog.bucket.presentation.home.HomeFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun bindingLayout(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun initView() {
        binding.safe {

        }

        initFragment()
    }

    private fun initFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(HomeFragment.getInstance(), HomeFragment.TAG)
        fragmentTransaction.commit()
    }

}