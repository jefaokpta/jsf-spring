package com.example.jsfspring.controller

import jakarta.faces.view.ViewScoped
import jakarta.inject.Named

@Named
@ViewScoped
class TestBean {

    private val name: String = "Jefones"

    fun getName() = name
}