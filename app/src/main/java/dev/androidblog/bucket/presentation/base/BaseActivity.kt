package dev.androidblog.bucket.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import timber.log.Timber

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    var binding: VB? = null

    abstract fun bindingLayout(): VB

    abstract fun initView()

    abstract fun initData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = bindingLayout()
        setContentView(binding?.root)
        initView()
        initData()
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume : ${binding?.javaClass?.name}")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause : ${binding?.javaClass?.name}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy : ${binding?.javaClass?.name}")
        binding = null
    }
}