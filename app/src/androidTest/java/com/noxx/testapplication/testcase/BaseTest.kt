package com.noxx.testapplication.testcase

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.uiautomator.UiDevice
import com.noxx.testapplication.ui.MainActivity
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
abstract class BaseTest {
    lateinit var device: UiDevice
    private val activityRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Before
    fun setUp() {
        activityRule.launchActivity(null)
        device = startDevice()
    }

    private fun startDevice(): UiDevice {
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        return device
    }
}