package com.platforms.editor

actual open class Platform actual constructor(
  private val url: String
) {
  actual fun get():String {
    return "Platform Android $url"
  }
}