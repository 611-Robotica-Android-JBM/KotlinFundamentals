package com.example.lib

fun main(){
    val numeros = listOf(19,27,3,47,52,645,76,87,98,10)
    //val unNumero = numeros[3]
    var numeroMaximo = numeros[0]
    val numerosQueCambian = mutableListOf<Int>()
    numerosQueCambian.add(2)
    numerosQueCambian.add(3)
    //println(unNumero)
    // operador aritmetico

    for (n in numeros){
        if(n > numeroMaximo) {
            numeroMaximo = n
        }
    }
    println(numeroMaximo)
    val palindromo = "anita lava la tina"
    for(letra in palindromo){
        println(letra)
    }
}