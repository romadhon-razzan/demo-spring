package com.example.demo.v1.customer

import com.example.demo.router.Router
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import javax.validation.Valid

@RestController
class CustomerController : ResponseEntityExceptionHandler(){

    @Autowired
    lateinit var service: CustomerService
    companion object { const val V1 = "v1" }

    @PostMapping(V1+Router.CREATE_CUSTOMER)
    fun save(@RequestBody customer: Customer): ResponseEntity<MutableMap<String, Any?>> {
        return service.save(customer)
    }

    @PostMapping(V1+Router.UPDATE_CUSTOMER)
    fun update(@Valid @RequestBody customer: Customer): ResponseEntity<MutableMap<String, Any?>> {
        return service.update(customer)
    }

    @RequestMapping(V1+Router.FIND_ALL_CUSTOMER)
    fun findAll(): ResponseEntity<MutableMap<String, Any?>> {
        return service.findAll()
    }

    @RequestMapping(V1+Router.FIND_CUSTOMER_ID)
    fun findById(@PathVariable id: Long): ResponseEntity<MutableMap<String, Any?>> {
        return service.findById(id)
    }

    @RequestMapping(V1+Router.FIND_CUSTOMER_NAME)
    fun findByName(@PathVariable name: String): ResponseEntity<MutableMap<String, Any?>> {
        return service.findByName(name)
    }

}