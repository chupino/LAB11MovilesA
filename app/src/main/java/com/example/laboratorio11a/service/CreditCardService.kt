package com.example.laboratorio11a.service

import com.example.laboratorio11a.model.CreditCardResponse
import retrofit2.http.GET

interface CreditCardService {
    @GET("credit_cards")
    suspend fun getCreditCards(): CreditCardResponse
}
