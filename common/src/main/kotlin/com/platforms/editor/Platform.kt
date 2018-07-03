package com.platforms.editor

expect open class Platform(
    url: String
) {
    fun get():String
}