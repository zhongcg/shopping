package org.jiqiang.shopping.repository.model
import androidx.annotation.Keep

import com.google.gson.annotations.SerializedName


@Keep
data class ProductInfo(
    @SerializedName("api")
    val api: String?,
    @SerializedName("v")
    val v: String?,
    @SerializedName("ret")
    val ret: List<String?>?,
    @SerializedName("data")
    val data: Data?
) {
    @Keep
    data class Data(
        @SerializedName("apiStack")
        val apiStack: List<ApiStack?>?,
        @SerializedName("seller")
        val seller: Seller?,
        @SerializedName("propsCut")
        val propsCut: String?,
        @SerializedName("item")
        val item: Item?,
        @SerializedName("debug")
        val debug: Debug?,
        @SerializedName("resource")
        val resource: Resource?,
        @SerializedName("vertical")
        val vertical: Vertical?,
        @SerializedName("params")
        val params: Params?,
        @SerializedName("mockData")
        val mockData: String?,
        @SerializedName("rate")
        val rate: Rate?,
        @SerializedName("props2")
        val props2: Props2?,
        @SerializedName("skuBase")
        val skuBase: SkuBase?
    ) {
        @Keep
        data class ApiStack(
            @SerializedName("name")
            val name: String?,
            @SerializedName("value")
            val value: String?
        )

        @Keep
        data class Seller(
            @SerializedName("userId")
            val userId: String?,
            @SerializedName("shopId")
            val shopId: String?,
            @SerializedName("shopName")
            val shopName: String?,
            @SerializedName("shopUrl")
            val shopUrl: String?,
            @SerializedName("taoShopUrl")
            val taoShopUrl: String?,
            @SerializedName("shopIcon")
            val shopIcon: String?,
            @SerializedName("fans")
            val fans: String?,
            @SerializedName("allItemCount")
            val allItemCount: String?,
            @SerializedName("newItemCount")
            val newItemCount: String?,
            @SerializedName("showShopLinkIcon")
            val showShopLinkIcon: Boolean?,
            @SerializedName("shopCard")
            val shopCard: String?,
            @SerializedName("sellerType")
            val sellerType: String?,
            @SerializedName("shopType")
            val shopType: String?,
            @SerializedName("evaluates")
            val evaluates: List<Evaluate?>?,
            @SerializedName("evaluates2")
            val evaluates2: List<Evaluates2?>?,
            @SerializedName("sellerNick")
            val sellerNick: String?,
            @SerializedName("creditLevel")
            val creditLevel: String?,
            @SerializedName("creditLevelIcon")
            val creditLevelIcon: String?,
            @SerializedName("brandIcon")
            val brandIcon: String?,
            @SerializedName("brandIconRatio")
            val brandIconRatio: String?,
            @SerializedName("starts")
            val starts: String?,
            @SerializedName("goodRatePercentage")
            val goodRatePercentage: String?,
            @SerializedName("fbt2User")
            val fbt2User: String?,
            @SerializedName("simpleShopDOStatus")
            val simpleShopDOStatus: String?,
            @SerializedName("shopVersion")
            val shopVersion: String?,
            @SerializedName("atmosphereColor")
            val atmosphereColor: String?,
            @SerializedName("shopTextColor")
            val shopTextColor: String?,
            @SerializedName("entranceList")
            val entranceList: List<Entrance?>?,
            @SerializedName("atmophereMask")
            val atmophereMask: Boolean?
        ) {
            @Keep
            data class Evaluate(
                @SerializedName("title")
                val title: String?,
                @SerializedName("score")
                val score: String?,
                @SerializedName("type")
                val type: String?,
                @SerializedName("level")
                val level: String?,
                @SerializedName("levelText")
                val levelText: String?,
                @SerializedName("levelTextColor")
                val levelTextColor: String?,
                @SerializedName("levelBackgroundColor")
                val levelBackgroundColor: String?,
                @SerializedName("tmallLevelTextColor")
                val tmallLevelTextColor: String?,
                @SerializedName("tmallLevelBackgroundColor")
                val tmallLevelBackgroundColor: String?
            )

            @Keep
            data class Evaluates2(
                @SerializedName("titleColor")
                val titleColor: String?,
                @SerializedName("scoreTextColor")
                val scoreTextColor: String?,
                @SerializedName("title")
                val title: String?,
                @SerializedName("score")
                val score: String?,
                @SerializedName("type")
                val type: String?,
                @SerializedName("level")
                val level: String?,
                @SerializedName("levelText")
                val levelText: String?,
                @SerializedName("levelTextColor")
                val levelTextColor: String?
            )

            @Keep
            data class Entrance(
                @SerializedName("text")
                val text: String?,
                @SerializedName("textColor")
                val textColor: String?,
                @SerializedName("borderColor")
                val borderColor: String?,
                @SerializedName("backgroundColor")
                val backgroundColor: String?,
                @SerializedName("action")
                val action: List<Action?>?
            ) {
                @Keep
                data class Action(
                    @SerializedName("key")
                    val key: String?,
                    @SerializedName("params")
                    val params: Params?
                ) {
                    @Keep
                    data class Params(
                        @SerializedName("url")
                        val url: String?,
                        @SerializedName("trackParams")
                        val trackParams: TrackParams?,
                        @SerializedName("trackName")
                        val trackName: String?
                    ) {
                        @Keep
                        data class TrackParams(
                            @SerializedName("spm")
                            val spm: String?
                        )
                    }
                }
            }
        }

        @Keep
        data class Item(
            @SerializedName("itemId")
            val itemId: String?,
            @SerializedName("title")
            val title: String?,
            @SerializedName("subtitle")
            val subtitle: String?,
            @SerializedName("images")
            val images: List<String?>?,
            @SerializedName("categoryId")
            val categoryId: String?,
            @SerializedName("rootCategoryId")
            val rootCategoryId: String?,
            @SerializedName("brandValueId")
            val brandValueId: String?,
            @SerializedName("skuText")
            val skuText: String?,
            @SerializedName("countMultiple")
            val countMultiple: List<Any?>?,
            @SerializedName("exParams")
            val exParams: ExParams?,
            @SerializedName("commentCount")
            val commentCount: String?,
            @SerializedName("favcount")
            val favcount: String?,
            @SerializedName("taobaoDescUrl")
            val taobaoDescUrl: String?,
            @SerializedName("tmallDescUrl")
            val tmallDescUrl: String?,
            @SerializedName("taobaoPcDescUrl")
            val taobaoPcDescUrl: String?,
            @SerializedName("pcADescUrl")
            val pcADescUrl: String?,
            @SerializedName("moduleDescUrl")
            val moduleDescUrl: String?,
            @SerializedName("openDecoration")
            val openDecoration: Boolean?,
            @SerializedName("moduleDescParams")
            val moduleDescParams: ModuleDescParams?,
            @SerializedName("h5moduleDescUrl")
            val h5moduleDescUrl: String?,
            @SerializedName("cartUrl")
            val cartUrl: String?
        ) {
            @Keep
            class ExParams

            @Keep
            data class ModuleDescParams(
                @SerializedName("f")
                val f: String?,
                @SerializedName("id")
                val id: String?
            )
        }

        @Keep
        data class Debug(
            @SerializedName("host")
            val host: String?,
            @SerializedName("app")
            val app: String?
        )

        @Keep
        data class Resource(
            @SerializedName("entrances")
            val entrances: Entrances?
        ) {
            @Keep
            data class Entrances(
                @SerializedName("askAll")
                val askAll: AskAll?
            ) {
                @Keep
                data class AskAll(
                    @SerializedName("icon")
                    val icon: String?,
                    @SerializedName("text")
                    val text: String?,
                    @SerializedName("link")
                    val link: String?
                )
            }
        }

        @Keep
        data class Vertical(
            @SerializedName("askAll")
            val askAll: AskAll?
        ) {
            @Keep
            data class AskAll(
                @SerializedName("askText")
                val askText: String?,
                @SerializedName("askIcon")
                val askIcon: String?,
                @SerializedName("answerText")
                val answerText: String?,
                @SerializedName("answerIcon")
                val answerIcon: String?,
                @SerializedName("linkUrl")
                val linkUrl: String?,
                @SerializedName("title")
                val title: String?,
                @SerializedName("questNum")
                val questNum: String?,
                @SerializedName("showNum")
                val showNum: String?,
                @SerializedName("modelList")
                val modelList: List<Model?>?,
                @SerializedName("model4XList")
                val model4XList: List<Model4X?>?
            ) {
                @Keep
                data class Model(
                    @SerializedName("askText")
                    val askText: String?,
                    @SerializedName("answerCountText")
                    val answerCountText: String?,
                    @SerializedName("firstAnswer")
                    val firstAnswer: String?
                )

                @Keep
                data class Model4X(
                    @SerializedName("askText")
                    val askText: String?,
                    @SerializedName("answerCountText")
                    val answerCountText: String?,
                    @SerializedName("askIcon")
                    val askIcon: String?,
                    @SerializedName("askTextColor")
                    val askTextColor: String?
                )
            }
        }

        @Keep
        data class Params(
            @SerializedName("trackParams")
            val trackParams: TrackParams?
        ) {
            @Keep
            data class TrackParams(
                @SerializedName("brandId")
                val brandId: String?,
                @SerializedName("BC_type")
                val bCType: String?,
                @SerializedName("categoryId")
                val categoryId: String?
            )
        }


        @Keep
        data class Rate(
            @SerializedName("totalCount")
            val totalCount: String?,
            @SerializedName("invite")
            val invite: Invite?,
            @SerializedName("keywords")
            val keywords: List<Keyword?>?,
            @SerializedName("rateList")
            val rateList: List<Rate?>?,
            @SerializedName("utFeedId")
            val utFeedId: String?
        ) {
            @Keep
            data class Invite(
                @SerializedName("showInvite")
                val showInvite: String?,
                @SerializedName("inviteText")
                val inviteText: String?
            )

            @Keep
            data class Keyword(
                @SerializedName("attribute")
                val attribute: String?,
                @SerializedName("word")
                val word: String?,
                @SerializedName("count")
                val count: String?,
                @SerializedName("type")
                val type: String?
            )

            @Keep
            data class Rate(
                @SerializedName("content")
                val content: String?,
                @SerializedName("userName")
                val userName: String?,
                @SerializedName("headPic")
                val headPic: String?,
                @SerializedName("memberLevel")
                val memberLevel: String?,
                @SerializedName("dateTime")
                val dateTime: String?,
                @SerializedName("createTimeInterval")
                val createTimeInterval: String?,
                @SerializedName("skuInfo")
                val skuInfo: String?,
                @SerializedName("tmallMemberLevel")
                val tmallMemberLevel: String?,
                @SerializedName("isVip")
                val isVip: String?,
                @SerializedName("feedId")
                val feedId: String?
            )
        }

        @Keep
        class Props2

        @Keep
        data class SkuBase(
            @SerializedName("skus")
            val skus: List<Sku?>?,
            @SerializedName("props")
            val props: List<Prop?>?
        ) {
            @Keep
            data class Sku(
                @SerializedName("skuId")
                val skuId: String?,
                @SerializedName("propPath")
                val propPath: String?
            )

            @Keep
            data class Prop(
                @SerializedName("pid")
                val pid: String?,
                @SerializedName("name")
                val name: String?,
                @SerializedName("values")
                val values: List<Value?>?
            ) {
                @Keep
                data class Value(
                    @SerializedName("vid")
                    val vid: String?,
                    @SerializedName("name")
                    val name: String?,
                    @SerializedName("image")
                    val image: String?
                )
            }
        }
    }
}