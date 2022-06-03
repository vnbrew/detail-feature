package com.module.jetpack.compose.detail.impl.di

import com.module.jetpack.compose.common.di.FeatureScoped
import com.module.jetpack.compose.data.api.DataProvider
import com.module.jetpack.compose.detail.api.DetailProvider
import com.module.jetpack.compose.detail.impl.DetailViewModel
import dagger.Component

@FeatureScoped
@Component(
    modules = [DetailModule::class],
    dependencies = [DataProvider::class]
)
interface DetailComponent : DetailProvider {
    val viewModel: DetailViewModel
}