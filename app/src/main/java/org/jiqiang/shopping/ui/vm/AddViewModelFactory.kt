package org.jiqiang.shopping.ui.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.jiqiang.shopping.repository.AppRemoteRepository
import org.jiqiang.shopping.repository.AppRepository

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class AddViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AddViewModel::class.java)) {
            return AddViewModel(AppRepository(AppRemoteRepository())) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}