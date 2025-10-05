package com.cesar.lolchampinfo.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChampionResponseModel(
    @SerialName("data")
    val champion: Map<String, ChampionModel> = emptyMap(),
)

fun Map<String, ChampionModel>.toChampionList(): List<ChampionModel> =
    this.values.toList()