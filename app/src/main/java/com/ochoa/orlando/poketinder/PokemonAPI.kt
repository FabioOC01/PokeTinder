package com.ochoa.orlando.poketinder

import retrofit2.Response
import retrofit2.http.GET

interface PokemonAPI {
    @GET("/api/v2/pokemon")
    suspend fun getPokemons(): Response<PokemonListResponse>

}