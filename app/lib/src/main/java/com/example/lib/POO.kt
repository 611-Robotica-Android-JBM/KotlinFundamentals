package com.example.lib

//POO busca representar objetos de la vida real con codigo
// 4 pilares fundamentales
/* a pie
abstraccion
polimorfismo
herenciia
encapsulamiento
padre e hijo

vehiculo -----> coche -- motocicleta

 */

class Person(val name : String, val age: Int){
    //constructor -->metodo inicial, cuando se instancia una clase
    fun sayHello(){
        println("hola soy $name y tengo $age años")
    }
}

// clases abstractas
// una clase que nooo se puede instanciar
abstract class Shape{
    abstract fun calculateArea() : Double
}
class Circle(val radius : Double) : Shape(){
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

}
class Square(val side : Double) : Shape(){
    override fun calculateArea(): Double {
        return side * side

    }
}

open class Animal{
    open fun makeSound(){
        println("haciendo un sonido generico")
    }
}
class eagle : Animal(){
    override fun makeSound() {
        println("TRICAMPION!")
    }
}
class Bear : Animal(){

}

fun main(){
    val person = Person(name = "Jonathan", age = 20)
    val person2 = Person(age = 28, name = "Juan")
    person.sayHello()
    println(person2.name)
    println(person2.age)
    // person2.name = "Juan" --> esto falla porque en la clase esta el name en val
    // person2 = Person(name = "Daniel", age = 4) esto falla porque person2 es val y no puede cambiar

    val circle = Circle(radius = 10.0)
    val square = Square(side = 10.0)
    val shapes = listOf(circle,square)
    val shape1 = shapes[0]
    shape1.calculateArea()
}