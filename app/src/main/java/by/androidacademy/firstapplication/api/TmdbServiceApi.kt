package by.androidacademy.firstapplication.api

import by.androidacademy.firstapplication.Secrets
import by.androidacademy.firstapplication.api.dto.PopularMoviesDto
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbServiceApi {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String = Secrets.SERVER_API_KEY
    ): PopularMoviesDto
}