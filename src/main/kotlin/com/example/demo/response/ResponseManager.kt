package com.example.demo.response

import java.util.LinkedHashMap

class ResponseManager {
    companion object {
        fun success(data: Any?, message: String?) : MutableMap<String, Any?> = response(data,message)

        fun error(data: Any, message: String) : MutableMap<String, Any?> = response(data,message)

        private fun response(data: Any?, message: String?): MutableMap<String, Any?> {
            val response: MutableMap<String, Any?> = LinkedHashMap()
            data.also { response["data"] = it }
            response["applicationSystem"] = message?.let { applicationSystem(it, ResponseStatus.SUCCESS) }

            return response
        }

        private fun applicationSystem(message: String, code: Int): MutableMap<String, Any?> {

            val applicationSystem: MutableMap<String, Any?> = LinkedHashMap()
            applicationSystem["status"] = code
            applicationSystem["message"] = message

            return applicationSystem
        }
    }
}