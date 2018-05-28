package com.douevencode.kotlintesting

enum class CardIssuer {
    AMERICAN_EXPRESS,
    JCB,
    MASTER_CARD,
    VISA;

    companion object {
        fun fromCardNumber(cardNumber: String) = cardNumber.run {
            when {
                startsWith("34") || startsWith("37") -> AMERICAN_EXPRESS
                startsWith("5") -> MASTER_CARD
                startsWith("4") -> VISA
                startsWith("30") -> JCB
                else -> throw IllegalArgumentException()
            }
        }
    }
}