package org.jiqiang.shopping.net

import com.bbgo.common_base.net.GsonTypeAdapterFactory
import org.jiqiang.shopping.net.interceptor.LoggingInterceptor
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 *  author: wangyb
 *  date: 3/29/21 5:46 PM
 *  description: 服务创建类
 */
object ServiceCreators {

    private const val BASE_URL = "https://wanandroid.com/"

    private const val MAX_CACHE_SIZE: Long = 1024 * 1024 * 50 // 50M 的缓存大小


    val httpClient = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(20, TimeUnit.SECONDS)
        .retryOnConnectionFailure(true)
        .addInterceptor(LoggingInterceptor())
        .build()

    private val builder = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(httpClient)
        .addCallAdapterFactory(FlowCallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())

    private val retrofit = builder.build()

//    val service: HttpApiService by lazy { retrofit.create(HttpApiService::class.java) }

    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)

}
