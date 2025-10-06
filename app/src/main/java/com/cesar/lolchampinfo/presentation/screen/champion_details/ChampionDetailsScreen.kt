package com.cesar.lolchampinfo.presentation.screen.champion_details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.cesar.lolchampinfo.data.repository.ApiRepositoryImpl
import com.cesar.lolchampinfo.domain.model.ChampionModel
import com.cesar.lolchampinfo.presentation.screen.champion_details.components.ChampionHeader
import com.cesar.lolchampinfo.presentation.screen.champion_details.components.ChampionLore
import com.cesar.lolchampinfo.presentation.screen.champion_details.components.ChampionPassive
import com.cesar.lolchampinfo.presentation.screen.champion_details.components.ChampionSpell

@Composable
fun ChampionDetailsScreen(
    champion: ChampionModel
) {

    Scaffold { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding
        ) {
            item {
                AsyncImage(
                    model = ApiRepositoryImpl.imageSplashUrl + "${champion.id}_0.jpg",
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )

                ChampionHeader(
                    champion = champion,
                    modifier = Modifier.padding(
                        vertical = 6.dp,
                        horizontal = 10.dp
                    )
                )

                ChampionLore(
                    lore = champion.lore ?: "",
                    modifier = Modifier.padding(
                        horizontal = 20.dp,
                        vertical = 6.dp
                    )
                )

                champion.passive?.let { passive ->
                    ChampionPassive(
                        passive = passive,
                        modifier = Modifier.padding(
                            horizontal = 6.dp,
                            vertical = 10.dp
                        )
                    )

                }

                Box (
                    modifier = Modifier.padding(
                        start = 16.dp
                    )
                ){
                    Text(
                        text = "Habilidades",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold

                    )
                }

                champion.spells.forEach { spell ->
                    ChampionSpell(
                        spell = spell,
                        modifier = Modifier.padding(
                            horizontal = 6.dp,
                            vertical = 10.dp
                        )
                    )

                }

            }

        }

    }

}