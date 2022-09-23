package org.jiqiang.shopping.repository

import kotlinx.coroutines.flow.Flow
import org.jiqiang.shopping.api.ApiService
import org.jiqiang.shopping.net.ServiceCreators
import org.jiqiang.shopping.repository.model.ProductInfo
import org.jiqiang.shopping.utils.Logs
import java.net.URLEncoder

class AppRemoteRepository {

    private val services = ServiceCreators.create(ApiService::class.java)

    fun getSkuInfo(itemNumId: String): Flow<ProductInfo> {
//        val encodeStr = URLEncoder.encode("{\"itemNumId\":\"$itemNumId\"}", "utf-8")
//        Logs.d("编码-》$encodeStr")
        return services.getSkuInfo("{\"itemNumId\":\"$itemNumId\"}")
    }

}