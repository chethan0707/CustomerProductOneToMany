package com.chethan.ecommerce.entity

import com.chethan.ecommerce.repository.ProductRepository
import javax.persistence.*

@Entity
@Table(name = "customer")
class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int,
    var name: String,
    var email: String,
    var gender: String,
    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")
    var products:MutableList<Product>
) {

}