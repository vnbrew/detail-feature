package com.module.jetpack.compose.detail.api

import androidx.compose.runtime.compositionLocalOf

interface DetailProvider

val LocalDetailProvider = compositionLocalOf<DetailProvider> {
    error("No Detail provider found!")
}