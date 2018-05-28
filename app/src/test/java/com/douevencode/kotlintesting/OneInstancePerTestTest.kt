package com.douevencode.kotlintesting

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class OneInstancePerTestTest : StringSpec() {
    override fun isInstancePerTest() = true

    var one = 1

    init {
        "value definitely should be one" {
            one shouldBe 1
            one++
        }

        "still should be one" {
            one shouldBe 1
            one++
        }

        "nothing changes, still one" {
            one shouldBe 1
            one++
        }
    }
}