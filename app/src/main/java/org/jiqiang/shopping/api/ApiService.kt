package org.jiqiang.shopping.api

import kotlinx.coroutines.flow.Flow
import org.jiqiang.shopping.repository.model.ProductInfo
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    //https://h5api.m.taobao.com/
    @GET(
        "https://h5api.m.taobao.com/h5/mtop.taobao.detail.getdetail/6.0/?type=jsonp"
    )
    fun getSkuInfo(@Query("data") id: String): Flow<ProductInfo>


}