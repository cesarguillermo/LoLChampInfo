package com.cesar.lolchampinfo.util

import kotlinx.serialization.Serializable

@Serializable
data object  ChampionList

@Serializable
data class ChampionDetails(val id : String)