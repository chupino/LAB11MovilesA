package com.example.laboratorio11a.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.laboratorio11a.model.CreditCardResponse
import com.example.laboratorio11a.viewmodel.CreditCardViewModel

@Composable
fun CreditCardScreen(viewModel: CreditCardViewModel) {
    val creditCards by viewModel.creditCards.observeAsState(null)

    LaunchedEffect(Unit) {
        viewModel.fetchCreditCards()
    }

    Column {
        if (creditCards == null) {
            // Muestra el texto de Loading mientras trata de recibir la respuesta
            Text(text = "Loading...")
        } else {
            // Muestra el resultado de la solicitud
            CreditCardItem(creditCards!!)
        }
    }
}


@Composable
fun CreditCardItem(creditCard: CreditCardResponse) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Número de tarjeta: ${creditCard.credit_card_number}"
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Fecha de vencimiento: ${creditCard.credit_card_expiry_date}"
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Tipo de tarjeta: ${creditCard.credit_card_type}"
            )
        }
    }
}
