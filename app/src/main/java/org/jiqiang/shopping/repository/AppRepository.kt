package org.jiqiang.shopping.repository

import kotlinx.coroutines.flow.Flow
import org.jiqiang.shopping.repository.model.ProductInfo

class AppRepository constructor(private val remoteRepository: AppRemoteRepository) {

    fun getSkuInfo(itemNumId: String): Flow<ProductInfo> {
        return remoteRepository.getSkuInfo(itemNumId)
    }

}