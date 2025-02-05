package src

fun main(){
    val cafeteraSala = Cafetera("Sala")
    val cafeteraCocina = Cafetera("Cocina", 1000)
    val cafeteraOficina = Cafetera("Oficina", 750, 750)

    println(cafeteraSala)
    println(cafeteraCocina)
    println(cafeteraOficina)
}