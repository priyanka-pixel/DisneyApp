package com.example.disneyapp.domain.model

data class DisneyList(
    val id: Int,
    val name: String,
    val playtime: String,
    val plot: String,
    val poster: String,
    val release: String,
    var isFavorite:Boolean = false
)
