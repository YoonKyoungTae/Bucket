package dev.androidblog.bucket.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import dev.androidblog.bucket.R
import timber.log.Timber

abstract class BaseFragment<VB : ViewBinding> : Fragment() {

    var binding: VB? = null

    abstract fun bindingLayout(): VB

    abstract fun initView()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = inflater.inflate(R.layout.fragment_home, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
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