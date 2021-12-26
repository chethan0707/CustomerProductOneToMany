package com.chethan.ecommerce.controllers

import com.chethan.ecommerce.dto.OrderResponse
import com.chethan.ecommerce.entity.Customer
import com.chethan.ecommerce.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController {
    @Autowired
    lateinit var customerRepository:CustomerRepository

    @PostMapping(path = ["/placeOrder"])
    fun addInfo(@RequestBody request:Customer){
        customerRepository.save(request)
    }
    @GetMapping(path = ["/getInfo"])
    fun getInfo():List<OrderResponse>{
        return customerRepository.getJoinInformation()
    }
}