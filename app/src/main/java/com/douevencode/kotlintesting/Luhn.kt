package com.douevencode.kotlintesting

object Luhn {
    fun isValid(number: String) : Boolean {
        val clearNumber = number.filterNot(Char::isWhitespace)
        if (tooShort(clearNumber) || hasInvalidChars(clearNumber)) return false

        val sum = clearNumber
                .reversed()
                .map { it.toString().toInt() }
                .mapIndexed { index, num -> if (index % 2 == 1) transformDigit(num) else num }
                .sum()
        return sum % 10 == 0
    }

    private fun hasInvalidChars(clearNumber: String) = !clearNumber.all(Char::isDigit)

    private fun tooShort(clearNumber: String) = clearNumber.length < 2

    private fun transformDigit(num: Int) : Int {
        val doubled = num * 2
        return if (doubled > 9) doubled - 9 else doubled
    }
}
