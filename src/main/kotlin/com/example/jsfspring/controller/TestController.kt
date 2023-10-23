package com.example.jsfspring.controller

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope("request")
class TestController {

    private val name: String = "Jefones"

    fun name() = "para"
}