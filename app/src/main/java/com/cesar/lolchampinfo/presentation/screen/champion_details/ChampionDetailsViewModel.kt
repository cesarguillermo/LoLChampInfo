package com.cesar.lolchampinfo.presentation.screen.champion_details

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.cesar.lolchampinfo.domain.model.ChampionModel
import com.cesar.lolchampinfo.domain.repository.ApiRepository
import com.cesar.lolchampinfo.util.ChampionDetails
import com.skydoves.sandwich.onSuccess
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class ChampionDetailsViewModel @Inject constructor(
    private val apiRepository: ApiRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    var champion = mutableStateOf<ChampionModel?>(null)

    init {

        val args = savedStateHandle.toRoute<ChampionDetails>()

        viewModelScope.launch {
            apiRepository.getChampionByName(args.id)
                .onSuccess {
                    champion.value = data.champion.values.firstOrNull()
                }
        }

    }

}