package com.example.my_kotlin_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform