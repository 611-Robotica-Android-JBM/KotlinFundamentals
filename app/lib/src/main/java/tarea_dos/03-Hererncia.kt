package tarea_dos

open class Animal(val nombre: String, val edad: Int) {
    open fun hacerSonido() {
        println("Sonido genérico.")
    }
    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}
class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        // TODO: imprime ¡Guau!
        println("¡Guau!")
    }
}
// TODO: Crea Gato y Vaca de forma similar
class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Miaw!")
    }
}

class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Mu!")
    }
}

fun main() {
    val perro = Perro("Rex", 3)
    perro.describirse()
    perro.hacerSonido()
    // TODO: Crea y usa Gato y Vaca
    val gato = Gato(nombre= "Alfonzo", edad= 500)
    gato.describirse()
    gato.hacerSonido()

    val vaca = Vaca(nombre = "Roxxy", edad= 2)
    vaca.describirse()
    vaca.hacerSonido()
}