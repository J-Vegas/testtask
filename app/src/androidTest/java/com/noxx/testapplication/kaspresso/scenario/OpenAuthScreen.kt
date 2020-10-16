package com.noxx.testapplication.kaspresso.scenario

import com.kaspersky.kaspresso.testcases.api.scenario.BaseScenario
import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext
import com.noxx.testapplication.kaspresso.screen.main.AuthScreen

internal class OpenAuthScreen<ScenarioData>(
    private val login: String,
    private val password: String
) : BaseScenario<ScenarioData>() {

    override val steps: TestContext<ScenarioData>.() -> Unit = {
        step("Ввести логин $login и проверить, что он введен") {
            AuthScreen {
                etLogin.isVisible()
                etLogin.typeText(login)
                etLogin.hasText(login)
                closeSoftKeyboard()
            }
        }
        step("Ввести пароль $password и проверить, что он введен") {
            AuthScreen {
                etPassword.isVisible()
                etPassword.typeText(password)
                etPassword.hasText(password)
                closeSoftKeyboard()
            }
        }

        step("Нажать кнопку \"Войти\"") {
            AuthScreen {
                btnLogin.isVisible()
                btnLogin.click()
            }
        }
    }
}