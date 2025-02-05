package src

fun main(){
    val cafetera1 = Cafetera("Sala")
    val cafetera2 = Cafetera("Cocina", 750)
    val cafetera3 = Cafetera("Oficina", 500, 200)

    println("CAFETERAS:")
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)
    println("-------------------------------------------------------------------------")

    val listaTazas = mutableListOf<Taza>()

    var contador = 0

    println("TAZAS:")
    while (contador < 20){
        contador += 1
        val taza = Taza(color = Color.values().random(), capacidad = listOf(50, 75, 100).random()
        )
        listaTazas.add(taza)
        println(taza)
    }
    println("------------------------------------------------------------")

}