package com.noxx.testapplication.testcase.auth

import com.noxx.testapplication.screen.AuthScreen
import com.noxx.testapplication.testcase.BaseTest
import org.junit.Test

class TestCase02() : BaseTest() {
    private val login = "autotest"
    private val password = "autotest"
    private val wrongPassword = "1"

    @Test
    fun allSteps() {
        AuthScreen(device).btnLogin.click()
        AuthScreen(device).message.text.equals("Необходимо ввести логин и пароль")
        AuthScreen(device).btnOk.click()

        AuthScreen(device).etLogin.clearTextField()
        AuthScreen(device).etLogin.setText(login)
        AuthScreen(device).etLogin.text.equals(login)
        AuthScreen(device).btnLogin.click()
        AuthScreen(device).message.text.equals("Необходимо ввести логин и пароль")
        AuthScreen(device).btnOk.click()

        AuthScreen(device).etLogin.clearTextField()
        AuthScreen(device).etLogin.setText(login)
        AuthScreen(device).etLogin.text.equals(login)
        AuthScreen(device).etPassword.clearTextField()
        AuthScreen(device).etPassword.setText(wrongPassword)
        AuthScreen(device).etPassword.text.equals(wrongPassword)
        AuthScreen(device).btnLogin.click()
        AuthScreen(device).message.text.equals("Логин или пароль введен неверно")
        AuthScreen(device).btnOk.click()

        AuthScreen(device).etLogin.clearTextField()
        AuthScreen(device).etLogin.setText(login)
        AuthScreen(device).etLogin.text.equals(login)
        AuthScreen(device).etPassword.clearTextField()
        AuthScreen(device).etPassword.setText(password)
        AuthScreen(device).etPassword.text.equals(password)
        AuthScreen(device).btnLogin.click()
        AuthScreen(device).message.text.equals("Успешный вход в приложение")
        AuthScreen(device).btnOk.click()
    }
}
