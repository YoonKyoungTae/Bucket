package dev.androidblog.bucket.presentation.bridge

import dev.androidblog.bucket.databinding.ActivityBridgeBinding
import dev.androidblog.bucket.presentation.base.BaseActivity

class BridgeActivity: BaseActivity<ActivityBridgeBinding>() {

    override fun bindingLayout(): ActivityBridgeBinding = ActivityBridgeBinding.inflate(layoutInflater)

    override fun initView() {

    }

}