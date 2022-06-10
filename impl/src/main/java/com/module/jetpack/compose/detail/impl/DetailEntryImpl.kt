package com.module.jetpack.compose.detail.impl

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.module.jetpack.compose.common.Destinations
import com.module.jetpack.compose.common.di.injectedViewModel
import com.module.jetpack.compose.data.api.LocalDataProvider
import com.module.jetpack.compose.detail.api.DetailEntry
import com.module.jetpack.compose.detail.impl.di.DaggerDetailComponent
import com.module.jetpack.compose.detail.impl.ui.DetailScreen
import javax.inject.Inject

class DetailEntryImpl @Inject constructor() : DetailEntry() {

    @Composable
    override fun NavGraphBuilder.Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        val viewModel = injectedViewModel {
            DaggerDetailComponent.builder().dataProvider(LocalDataProvider.current)
                .build().viewModel
        }
        DetailScreen(viewModel = viewModel, onUserSelect = {
        })
    }
}