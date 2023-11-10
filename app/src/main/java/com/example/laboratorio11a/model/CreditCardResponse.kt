package com.example.laboratorio11a.model

data class CreditCardResponse(
    val credit_card_expiry_date: String,
    val credit_card_number: String,
    val credit_card_type: String,
    val id: Int,
    val uid: String
)