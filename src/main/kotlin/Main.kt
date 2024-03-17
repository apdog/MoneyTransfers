package ru.netology

fun main() {
    val amount = 10000.0
    commissionCalculation(amount)
}

fun commissionCalculation(amount: Double) {
    val commissionRate = 0.0075
    val minCommission = 35.0
    val result = amount * commissionRate
    val commission = if (result < minCommission) minCommission else result
    println("Комиссия с перевода $amount рублей составила $commission рублей")
}