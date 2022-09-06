package dev.androidblog.intent.presentation.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import timber.log.Timber

abstract class BaseActivity<T : ViewBinding>: AppCompatActivity() {

    lateinit var binding: T

    abstract fun combineViewBinding(): T

    abstract fun initView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = combineViewBinding()
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume($binding)")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause($binding)")

    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy($binding)")
    }
}