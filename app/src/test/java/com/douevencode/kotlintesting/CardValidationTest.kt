package com.douevencode.kotlintesting

import com.douevencode.kotlintesting.CardIssuer.MASTER_CARD
import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class CardValidationTest : ShouldSpec({
    "Card number 5494275943345454" {
        val cardNumber = "5494275943345454"

        should("have issuer MasterCard") {
            CardIssuer.fromCardNumber(cardNumber) shouldBe MASTER_CARD
        }

        should("pass Luhn test") {
            Luhn.isValid(cardNumber) shouldBe true
        }
    }
})