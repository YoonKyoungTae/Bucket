package dev.androidblog.bucket.presentation.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import dev.androidblog.bucket.databinding.FragmentDetailBinding
import dev.androidblog.bucket.databinding.FragmentHomeBinding
import dev.androidblog.bucket.presentation.base.BaseFragment

class DetailFragment : BaseFragment<FragmentDetailBinding>() {

    companion object {

        const val TAG: String = "DetailFragment"

        fun getInstance(): DetailFragment {
            return DetailFragment()
        }

    }

    override fun bindingLayout(inflater: LayoutInflater, container: ViewGroup?): FragmentDetailBinding {
        return FragmentDetailBinding.inflate(inflater, container, false)
    }

    override fun initView() {

    }

}