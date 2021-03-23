package com.example.demo.v1.customer

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<Customer, Long> {
    @Query("SELECT c.name FROM Customer c where c.name = :name")
    fun findByName(@Param("name") name: String): Iterable<Customer>
}