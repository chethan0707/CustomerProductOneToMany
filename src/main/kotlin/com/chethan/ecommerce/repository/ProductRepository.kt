package com.chethan.ecommerce.repository

import com.chethan.ecommerce.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository :JpaRepository<Product,Int>{
}