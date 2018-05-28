package com.douevencode.kotlintesting

import io.kotlintest.shouldBe
import io.kotlintest.specs.FreeSpec

class MuchNestedTest : FreeSpec({
    "When I want to test something complicated" - {
        "and one condition needs to be met" - {
            "then another one" - {
                "and the last one" - {
                    "then you can finally assert something" {
                        "assertion" shouldBe "assertion"
                    }
                }
            }
        }
    }
})