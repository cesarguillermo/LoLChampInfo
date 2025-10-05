package com.cesar.lolchampinfo.data.repository

import com.cesar.lolchampinfo.domain.model.ChampionResponseModel
import com.cesar.lolchampinfo.domain.repository.ApiRepository
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.ktor.getApiResponse
import io.ktor.client.HttpClient

class ApiRepositoryImpl(
    private val httpClient: HttpClient
) : ApiRepository {

    companion object {
        const val baseUrl = "https://ddragon.leagueoflegends.com/cdn/15.19.1/data/es_ES/"

        const val imageSplashUrl = "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/"
        const val imageLoadingUrl = "https://ddragon.leagueoflegends.com/cdn/img/champion/loading/"
        const val imageSquareUrl = "https://ddragon.leagueoflegends.com/cdn/15.19.1/img/champion/"
        const val imagePassiveUrl = "https://ddragon.leagueoflegends.com/cdn/15.19.1/img/passive/"
        const val imageAbilityUrl = "https://ddragon.leagueoflegends.com/cdn/15.19.1/img/spell/"
    }


    override suspend fun getAllChampions(): ApiResponse<ChampionResponseModel> =
        httpClient.getApiResponse("champion.json")

    override suspend fun getChampionByName(name: String): ApiResponse<ChampionResponseModel> =
        httpClient.getApiResponse("champion/$name.json")

}