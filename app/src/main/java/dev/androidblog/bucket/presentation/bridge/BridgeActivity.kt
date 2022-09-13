package dev.androidblog.bucket.presentation.bridge

import android.content.Intent
import android.widget.Toast
import androidx.activity.viewModels
import dev.androidblog.bucket.core.extensions.showLongToast
import dev.androidblog.bucket.databinding.ActivityBridgeBinding
import dev.androidblog.bucket.presentation.base.BaseActivity

class BridgeActivity: BaseActivity<ActivityBridgeBinding>() {

    private val bridgeViewModel: BridgeViewModel by viewModels()

    override fun bindingLayout(): ActivityBridgeBinding = ActivityBridgeBinding.inflate(layoutInflater)

    override fun initView() {
        bridgeViewModel.errorStatus.observe(this) {
            showLongToast("저장이 완료되었습니다.")
            finish()
        }
    }

    override fun initData() {
        when(intent.action) {
            Intent.ACTION_SEND -> {
                if ("text/plain" == intent.type) {
                    bridgeViewModel.handleTextData(intent.getStringExtra(Intent.EXTRA_TEXT))
                }
            }
            Intent.ACTION_SEND_MULTIPLE -> {
                //TODO 추후 구현 https://developer.android.com/training/sharing/receive?hl=ko#handling-content
            }
        }
    }

}