package tarea_dos

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
    fun depositar(cantidad: Double) {
        // TODO
        if (cantidad > 0) {
            saldo += cantidad
            println("Depósito realizado. Nuevo saldo: $saldo")
        } else {
            println("Error: la cantidad a depositar debe ser mayor que 0")
        }
    }
    fun retirar(cantidad: Double) {
        // TODO: verifica que haya saldo suficiente
        if (cantidad <= saldo) {
            saldo -= cantidad
            println("Retiro realizado. Nuevo saldo: $saldo")
        } else {
            println("Error: saldo insuficiente. Saldo actual: $saldo")
        }
    }
    fun mostrarSaldo() {
        // TODO
        println("Saldo actual de $titular: $saldo")
    }
}
fun main() {
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0) // No debe permitirlo
    cuenta.mostrarSaldo()
}