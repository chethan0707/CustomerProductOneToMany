package com.chethan.ecommerce.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Product(
    @Id
    var pid: Int,
    var productName: String,
    var qty: Int,
    var price: Int,
) {

}