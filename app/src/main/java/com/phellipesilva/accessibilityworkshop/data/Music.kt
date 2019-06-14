package com.phellipesilva.accessibilityworkshop.data

import java.io.Serializable

data class Music(
    val title: String,
    val artist: String,
    val price: String,
    val album: String,
    val downloadNumber: Int,
    val albumPhotoUrl: String
) : Serializable