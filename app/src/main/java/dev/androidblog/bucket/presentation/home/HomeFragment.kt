package dev.androidblog.bucket.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import dev.androidblog.bucket.databinding.FragmentHomeBinding
import dev.androidblog.bucket.presentation.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    companion object {

        const val TAG: String = "HomeFragment"

        fun getInstance(): HomeFragment {
            return HomeFragment()
        }

    }

    override fun bindingLayout(inflater: LayoutInflater, container: ViewGroup?): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

    override fun initView() {

    }

}