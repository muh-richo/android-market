package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListBanner
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainCardCategory(modifier: Modifier = Modifier, listBanner: ListBanner) {
    Card (
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
            .height(48.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Image(painter = painterResource(id = listBanner.imgBanner), contentDescription = null)
    }
}

@Preview(showBackground = true)
@Composable
fun MainCardCategoryPreview() {
    MarketTheme {
        MainCardCategory(listBanner = ListBanner(R.drawable.banner1))
    }
}