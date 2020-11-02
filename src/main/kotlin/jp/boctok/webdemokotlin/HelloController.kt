package jp.boctok.webdemokotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
        @GetMapping("/")
        fun getHello():String{
            return "hello"
        }

        @GetMapping("/by")
        fun getBy():String{
            return "Good by"
        }
}