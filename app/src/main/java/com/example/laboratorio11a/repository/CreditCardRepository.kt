package com.example.laboratorio11a.repository

import com.example.laboratorio11a.model.CreditCardResponse
import com.example.laboratorio11a.service.RetrofitInstance

class CreditCardRepository {
    private val creditCardService = RetrofitInstance.creditCardService

    suspend fun getCreditCards(): CreditCardResponse {
        return creditCardService.getCreditCards()
    }
}
