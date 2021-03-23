package com.example.demo.v1.customer

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Customer (
        val name: String,
        val phone_number: String,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1) {
    constructor() : this("","")
}