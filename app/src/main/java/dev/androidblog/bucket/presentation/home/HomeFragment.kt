package dev.androidblog.bucket.presentation.home

import dev.androidblog.bucket.databinding.FragmentHomeBinding
import dev.androidblog.bucket.presentation.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    companion object {

        const val TAG: String = "HomeFragment"

        fun getInstance(): HomeFragment {
            return HomeFragment()
        }

    }

    override fun bindingLayout(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun initView() {

    }

}