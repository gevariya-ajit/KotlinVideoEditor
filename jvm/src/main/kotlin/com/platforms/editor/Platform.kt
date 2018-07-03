package com.platforms.editor

actual class Platform actual constructor(
  private val url: String
) {
  actual fun get():String {
    return "Platform Android $url"
  }
}