package com.noxx.testapplication.kaspresso.testcase

import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.params.FlakySafetyParams
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase

internal abstract class BaseTest :
    TestCase(Kaspresso.Builder.advanced { apply { FlakySafetyParams.default() } }){
}