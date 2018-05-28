package com.douevencode.kotlintesting.issuer

import com.douevencode.kotlintesting.CardIssuer
import com.douevencode.kotlintesting.CardIssuer.*
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CardIssuerTest : StringSpec({
    "When card number starts with 34 or 37 the issuer should be American Express" {
        CardIssuer.fromCardNumber("344013826477034") shouldBe AMERICAN_EXPRESS
        CardIssuer.fromCardNumber("379237058082588") shouldBe AMERICAN_EXPRESS
    }

    "When card number starts with 5 the issuer should be Mastercard" {
        CardIssuer.fromCardNumber("5494275943345454") shouldBe MASTER_CARD
    }

    "When card number starts with 4 the issuer should be Visa" {
        CardIssuer.fromCardNumber("4716157914089748") shouldBe VISA
    }

    "When card number starts with 30 the issuer should be JCB" {
        CardIssuer.fromCardNumber("3096164799494029") shouldBe JCB
    }
})

