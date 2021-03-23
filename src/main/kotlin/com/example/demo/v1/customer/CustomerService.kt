package com.example.demo.v1.customer

import com.example.demo.response.ResponseManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.util.*

@Service
class CustomerService {

    @Autowired
    lateinit var repository: CustomerRepository

    fun save(customer: Customer): ResponseEntity<MutableMap<String, Any?>> {
        repository.save(customer)
        return ResponseEntity.ok(ResponseManager.success(null,"Save student successfully"))
    }

    fun update(customer: Customer): ResponseEntity<MutableMap<String, Any?>> {
        repository.save(customer)
        return ResponseEntity.ok(ResponseManager.success(null,"Update student successfully"))
    }

    fun findAll(): ResponseEntity<MutableMap<String, Any?>> {
        val data : MutableIterable<Customer> = repository.findAll()
        return ResponseEntity.ok(ResponseManager.success(data,""))
    }

    fun findById(id: Long): ResponseEntity<MutableMap<String, Any?>> {
        val data : Optional<Customer> = repository.findById(id)
        return ResponseEntity.ok(ResponseManager.success(data,""))
    }

    fun findByName(name: String): ResponseEntity<MutableMap<String, Any?>> {
        val data : Iterable<Customer> = repository.findByName(name)
        return ResponseEntity.ok(ResponseManager.success(data,""))
    }
}