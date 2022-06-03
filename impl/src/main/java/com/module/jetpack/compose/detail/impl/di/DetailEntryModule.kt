package com.module.jetpack.compose.detail.impl.di

import com.module.jetpack.compose.common.FeatureEntry
import com.module.jetpack.compose.common.di.FeatureEntryKey
import com.module.jetpack.compose.detail.api.DetailEntry
import com.module.jetpack.compose.detail.impl.DetailEntryImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface DetailEntryModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(DetailEntry::class)
    fun detailEntry(entry: DetailEntryImpl): FeatureEntry
}