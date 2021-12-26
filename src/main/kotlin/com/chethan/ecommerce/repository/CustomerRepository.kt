package com.chethan.ecommerce.repository

import com.chethan.ecommerce.dto.OrderResponse
import com.chethan.ecommerce.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository


@Repository
interface CustomerRepository : JpaRepository<Customer, Int> {
    @Query("SELECT new com.chethan.ecommerce.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    fun getJoinInformation(): List<OrderResponse>
}