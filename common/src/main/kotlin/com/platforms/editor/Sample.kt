package com.platforms.editor

class Sample {
    fun checkPlatform():String {
        val platform = Platform("Platform is: ")
        return platform.get()
    }
}