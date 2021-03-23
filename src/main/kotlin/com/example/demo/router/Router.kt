package com.example.demo.router

class Router {
    companion object {
        const val CREATE_CUSTOMER = "/create-customer"
        const val UPDATE_CUSTOMER = "/update-customer"
        const val FIND_ALL_CUSTOMER = "/all-customer"
        const val FIND_CUSTOMER_ID = "/find-customer-id/{id}"
        const val FIND_CUSTOMER_NAME = "/find-customer-name/{name}"
    }
}