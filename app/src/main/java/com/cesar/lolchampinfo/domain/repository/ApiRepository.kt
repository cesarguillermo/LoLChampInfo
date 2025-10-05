package com.cesar.lolchampinfo.domain.repository

import com.cesar.lolchampinfo.domain.model.ChampionResponseModel
import com.skydoves.sandwich.ApiResponse

interface ApiRepository {

    suspend fun getAllChampions(): ApiResponse<ChampionResponseModel>

    suspend fun getChampionByName(name: String) :  ApiResponse<ChampionResponseModel>
}