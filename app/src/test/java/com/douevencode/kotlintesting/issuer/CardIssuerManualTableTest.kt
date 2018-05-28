package com.douevencode.kotlintesting.issuer

import com.douevencode.kotlintesting.CardIssuer
import com.douevencode.kotlintesting.CardIssuer.*
import io.kotlintest.shouldBe
import io.kotlintest.specs.FeatureSpec

class CardIssuerManualTableTest : FeatureSpec({
    feature("Card issuer recognition") {

        val cardData = mapOf(
                "344013826477034" to AMERICAN_EXPRESS,
                "379237058082588" to AMERICAN_EXPRESS,
                "5494275943345454" to MASTER_CARD,
                "4716157914089748" to VISA,
                "3096164799494029" to JCB)

        cardData.forEach { cardNumber, issuer ->
            scenario("card number $cardNumber should be recognized as $issuer") {
                CardIssuer.fromCardNumber(cardNumber) shouldBe issuer
            }
        }
    }
})