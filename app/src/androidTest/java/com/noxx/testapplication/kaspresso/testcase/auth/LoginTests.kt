package com.noxx.testapplication.kaspresso.testcase.auth

import androidx.test.core.app.ActivityScenario
import androidx.test.rule.ActivityTestRule
import com.noxx.testapplication.kaspresso.scenario.OpenAuthScreen
import com.noxx.testapplication.kaspresso.screen.main.AuthScreen
import com.noxx.testapplication.kaspresso.testcase.BaseTest
import com.noxx.testapplication.ui.MainActivity
import io.qameta.allure.android.runners.AllureAndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AllureAndroidJUnit4::class)
internal class LoginTests : BaseTest() {

    private val login = "autotest"
    private val password = "autotest"
    private val wrongPassword = "1"

//    @get:Rule
//    val activityRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Before
    fun setup() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun loginWithEmptyLoginPassword() {
        before("Авторизация без логина и пароля") {
            //activityRule.launchActivity(null)
        }.after {
            /* передать функцию очиски кеша */
        }.run {
            scenario(OpenAuthScreen("", ""))
            step("Проверяем текст сообщения и нажимаем ОК") {
                AuthScreen {
                    message.hasText("Необходимо ввести логин и пароль")
                    btnOk.click()
                }
            }
        }
    }

    @Test
    fun loginWithEmptyPassword() {
        before("Авторизация без пароля") {
            //activityRule.launchActivity(null)
        }.after {
            /* передать функцию очиски кеша */
        }.run {
            scenario(OpenAuthScreen(login, ""))
            step("Проверяем текст сообщения и нажимаем ОК") {
                AuthScreen {
                    message.hasText("Необходимо ввести логин и пароль")
                    btnOk.click()
                }
            }
        }
    }

    @Test
    fun loginWithWrongPassword() {
        before("Авторизация без логина и пароля") {
            //activityRule.launchActivity(null)
        }.after {
            /* передать функцию очиски кеша */
        }.run {
            scenario(OpenAuthScreen(login, wrongPassword))
            step("Проверяем текст сообщения и нажимаем ОК") {
                AuthScreen {
                    message.hasText("Логин или пароль введен неверно")
                    btnOk.click()
                }
            }
        }
    }

    @Test
    fun loginWithSuccessLoginPassword() {
        before("Авторизация без логина и пароля") {
            //activityRule.launchActivity(null)
        }.after {
            /* передать функцию очиски кеша */
        }.run {
            scenario(OpenAuthScreen(login, password))
            step("Проверяем текст сообщения и нажимаем ОК") {
                AuthScreen {
                    message.hasText("Успешный вход в приложение")
                    btnOk.click()
                }
            }
        }
    }
}