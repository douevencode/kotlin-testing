package com.douevencode.kotlintesting

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card_input.*

/**
 * A login screen that offers login via email/password.
 */
class CardInputActivity : AppCompatActivity(){

    val cardPresenter = CardPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_input)
        check_button.setOnClickListener {
            cardPresenter.validateCardData(card_number.text.toString())
        }
    }
}
