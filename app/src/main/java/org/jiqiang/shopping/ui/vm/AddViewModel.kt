package org.jiqiang.shopping.ui.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import org.jiqiang.shopping.api.ApiService
import org.jiqiang.shopping.net.ServiceCreators
import org.jiqiang.shopping.repository.AppRepository
import org.jiqiang.shopping.utils.Logs

class AddViewModel constructor(private val repository: AppRepository) : ViewModel() {



    fun getSkuInfo(itemId: String) = viewModelScope.launch {

        repository.getSkuInfo(itemId)
            .collectLatest {
                Logs.d("成功了 " + it.api)
            }
    }
}