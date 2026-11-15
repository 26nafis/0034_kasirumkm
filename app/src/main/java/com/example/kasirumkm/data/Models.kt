package com.example.kasirumkm.data

enum class UserRole {
    OWNER,
    KASIR
}

data class User(
    val name: String,
    val email: String,
    val role: UserRole
)

data class Product(
    val id: String,
    val name: String,
    val code: String,
    val category: String,
    val price: Long,
    val stock: Int
)

data class CartItem(
    val product: Product,
    val quantity: Int
)

data class Transaction(
    val id: String,
    val customer: String,
    val total: Long,
    val time: String,
    val cancelled: Boolean = false
)
