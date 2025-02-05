package src

fun main(){
    val cafeteraSala = Cafetera("Sala")
    val cafeteraCocina = Cafetera("Cocina", 750)
    val cafeteraOficina = Cafetera("Oficina", 500, 200)

    println(cafeteraSala)
    println(cafeteraCocina)
    println(cafeteraOficina)
}