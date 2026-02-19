package com.example.lib

fun main(){
//    //ctrl k ctrl c
//    //ctrl k ctrl u
//    // Variables INMUTABLES (incambiables)
//    val name : String = "Jonathan"  //un ejemplo es el nombre ya que no cambia
//
//    // variables MUTABLES (cambiables)
//    var age : Int = 20          // un ejemplo es la edad que si cambia
//    var age1 : Int? = null      // para que no tenga un valor inicial
//
//    // tipos de Datos Int, Strng, Double, Float, Cha, Array, Boolean
//    val isOld : Boolean = false
//    val height : Double = 1.75
//     commit 1
//    //string interpolation
//    println("Mi nombre es: $name, tengo $age y mido $height")
//    println(name + " " + age + " " + height)
//    println(age)
//    println(height)
//
//    //estructuras de control if, else, which, for
//    if (age > 18){
//        println("es un mayor de edad")
//    } else {
//        println("es un morrito")
//    }
//
//    //ciclo for
//
//    // scope
//    for(i in 0..10){
//        println(i)
//    }
//    for(i in 0..10 step 2){
//        println(i)
//    }
//    for(i in 10 downTo 0){
//        println(i)
//    }
//
//    //switch case
//    val dayOffweek = 1
//    when(dayOffweek){
//        1 -> {
//            println("es lunes")
//            println("mi vida es miserable")
//        }
//        2 -> println("es martes")
//        6, 7 -> println("es fin de semana")
//        else -> println("es un dia cualquiera")
//    }
/*escribir un programa que calcule el area de un rectangulo, que el usuario
proporcione la base y la altura y sse muestre en pantalla el resultado
 */
    //kotlin es un lenguaje null safety
    //operadores logicos || &&
    //operados aritmeticos + - = +
    // operador Elvis ?:
    var base : Double? = 0.0
    var height : Double? = 0.0
    println("Digita la base del rectangulo")
    val baseInput = readlnOrNull()
    base = baseInput?.toDoubleOrNull() ?: 0.0
    println("Digita la altura del rectangulo")
    val heightInput = readlnOrNull()
    height = heightInput?.toDoubleOrNull() ?: 0.0
    val area = base * height
    println("el area es: $area")
}

//creando funcionalidad 1
// creando funcionalidad 2
