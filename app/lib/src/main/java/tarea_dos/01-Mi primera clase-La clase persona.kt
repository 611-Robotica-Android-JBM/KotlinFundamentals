package tarea_dos

class Persona(val nombre: String, val edad: Int, val ciudad: String) {
    fun saludar() {
        // TODO: Imprime el saludo
        println("Hola, me llamo $nombre y tengo $edad años")
    }
    fun esMayorDeEdad(): Boolean {
        // TODO: Regresa true si edad >= 18
        if (edad >= 18){
            return true
        } else {
            return false
        }
    }
}
fun main() {
    val persona1 = Persona("Ana", 20, "Guadalajara")
    val persona2 = Persona("Luis", 15, "León")
// TODO: Llama los métodos
    persona1.saludar()
    println(persona1.esMayorDeEdad())
    persona2.saludar()
    println(persona2.esMayorDeEdad())
}