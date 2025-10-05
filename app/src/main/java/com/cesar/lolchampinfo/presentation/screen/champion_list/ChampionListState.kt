package com.cesar.lolchampinfo.presentation.screen.champion_list

import com.cesar.lolchampinfo.domain.model.ChampionModel

data class ChampionListState(
    val searchText : String = "",
    val champions : List<ChampionModel> = emptyList(),
    val filteredChampions: List<ChampionModel> = emptyList()

)
