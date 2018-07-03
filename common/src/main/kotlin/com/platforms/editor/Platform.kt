package com.platforms.editor

expect class Platform(
    url: String
) {
    fun get():String
}