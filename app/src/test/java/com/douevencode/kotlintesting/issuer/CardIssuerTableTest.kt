package com.douevencode.kotlintesting.issuer

import com.douevencode.kotlintesting.CardIssuer
import com.douevencode.kotlintesting.CardIssuer.*
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.forAll
import io.kotlintest.tables.headers
import io.kotlintest.tables.row
import io.kotlintest.tables.table

class CardIssuerTableTest : StringSpec({
    "Correctly recognizes card issuer" {

        val cardData = table(
                headers("cardNumber", "issuer"),
                row("344013826477034", AMERICAN_EXPRESS),
                row("379237058082588", AMERICAN_EXPRESS),
                row("5494275943345454", MASTER_CARD),
                row("4716157914089748", VISA),
                row("3096164799494029", JCB)
        )

        forAll(cardData) { cardNumber, issuer ->
            CardIssuer.fromCardNumber(cardNumber) shouldBe issuer
        }
    }
})