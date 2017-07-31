package com.andreyatapin.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
open class App(
        @Value("\${settings.str}") val str: String,
        @Value("\${settings.int}") val int: String
) {

    @RequestMapping("/")
    fun home(): Map<String, Any> {
        return mapOf(
            "str" to str, "int" to int
        )
    }

}


fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}