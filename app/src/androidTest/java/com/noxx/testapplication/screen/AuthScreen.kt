package com.noxx.testapplication.screen

import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject
import androidx.test.uiautomator.UiSelector

internal class AuthScreen(device: UiDevice) {

    val etLogin: UiObject = device.findObject(
        UiSelector()
            .resourceId("com.noxx.testapplication:id/etLogin")
    )
    val etPassword: UiObject = device.findObject(
        UiSelector()
            .resourceId("com.noxx.testapplication:id/etPassword")
    )
    val message: UiObject = device.findObject(
        UiSelector()
            .resourceId("com.noxx.testapplication:id/message")
    )
    val btnLogin: UiObject = device.findObject(
        UiSelector()
            .resourceId("com.noxx.testapplication:id/btnLogin")
    )
    val btnOk: UiObject = device.findObject(
        UiSelector()
            .resourceId("com.noxx.testapplication:id/positive")
    )
}