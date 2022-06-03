package com.module.jetpack.compose.detail.api

import com.module.jetpack.compose.common.ComposableFeatureEntry

abstract class DetailEntry : ComposableFeatureEntry {
    final override val featureRoute = "detail-feature"

    fun destination() = featureRoute
}