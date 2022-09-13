package dev.androidblog.bucket.presentation.bridge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class BridgeViewModel: ViewModel() {

    private var _errorStatus = MutableLiveData<Boolean>()
    val errorStatus: LiveData<Boolean>
        get() = _errorStatus

    fun handleTextData(text: String?) {
        //TODO 일반 텍스트인지 이메일인지 링크 번호인지 등... 가급적 미리 판단하여 저장
        viewModelScope.launch {
            delay(2000)
            _errorStatus.value = true
        }
    }

    fun handleImageData() {

    }

}