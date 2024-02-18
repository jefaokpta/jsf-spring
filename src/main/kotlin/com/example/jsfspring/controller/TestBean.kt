package com.example.jsfspring.controller

import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.context.SessionScoped
import jakarta.faces.view.ViewScoped
import jakarta.inject.Named
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import org.springframework.web.context.annotation.ApplicationScope
import org.springframework.web.context.annotation.RequestScope
import org.springframework.web.context.annotation.SessionScope
import java.io.Serializable

@Component
@Scope("view")
class TestBean: Serializable {

    private val log = LoggerFactory.getLogger(this::class.java)
    private var number = 0
    private val name: String = "Jefones"

    fun getName() = name

    fun getNumber(): Int {
        log.info("consultou: $number")
        return number
    }
    fun incrementNumber(){
        number++
        log.info("increment: $number")
    }
}