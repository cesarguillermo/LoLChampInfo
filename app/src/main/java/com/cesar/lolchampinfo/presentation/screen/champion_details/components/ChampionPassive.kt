package com.cesar.lolchampinfo.presentation.screen.champion_details.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.cesar.lolchampinfo.data.repository.ApiRepositoryImpl
import com.cesar.lolchampinfo.domain.model.PassiveModel
import com.cesar.lolchampinfo.domain.model.SpellModel

@Composable
fun ChampionPassive(
    passive: PassiveModel,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = Modifier.padding(start = 16.dp)
    ) {


        Text(
            text = "Pasiva",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,

            )

    }


    ListItem(
        headlineContent = {
            Text(
                text = passive.name ?: ""
            )
        },
        supportingContent = {
            Text(
                text = passive.description ?: ""
            )
        },
        leadingContent = {
            AsyncImage(
                model = ApiRepositoryImpl.imagePassiveUrl + "${passive.image?.full}",
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(32.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
        }
    )

}