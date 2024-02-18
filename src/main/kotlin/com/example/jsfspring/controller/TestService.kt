package com.example.jsfspring.controller

import org.springframework.stereotype.Service

@Service
class TestService {
    private var number = 0

    fun getNumber(): Int {
        println("consultou: $number")
        return number
    }
    fun incrementNumber(): Int {
        number++
        println("Number: $number")
        return number
    }
}