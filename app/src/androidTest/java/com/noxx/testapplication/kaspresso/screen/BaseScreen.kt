package com.noxx.testapplication.kaspresso.screen

import com.agoda.kakao.screen.Screen

internal abstract class BaseScreen<out T : BaseScreen<T>> : Screen<T>()