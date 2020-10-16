package com.noxx.testapplication.kaspresso.screen.main

import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.noxx.testapplication.R
import com.noxx.testapplication.kaspresso.screen.BaseScreen

internal object AuthScreen : BaseScreen<AuthScreen>() {

    val etLogin = KEditText { withId(R.id.etLogin) }
    val etPassword = KEditText { withId(R.id.etPassword) }
    val btnLogin = KButton { withId(R.id.btnLogin) }
    val btnOk = KButton { withId(R.id.positive) }
    val message = KTextView { withId(R.id.message) }

}