package src

fun llenarTazas(cafetera1: Cafetera, cafetera2: Cafetera, cafetera3: Cafetera, taza: Taza){
    if (cafetera1.cantidad != 0){
        cafetera1.servirTaza(taza)
    }
    if (cafetera2.cantidad != 0){
        cafetera2.servirTaza(taza)
    }
    if (cafetera3.cantidad != 0){
        cafetera3.servirTaza(taza)
    }
}

fun main(){
    val cafetera1 = Cafetera("Sala")
    val cafetera2 = Cafetera("Cocina", 750)
    val cafetera3 = Cafetera("Oficina", 500, 200)

    println("************************************************************************")
    println("CAFETERAS:")
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)

    val listaTazas = mutableListOf<Taza>()

    println("Escriba el número de tazas que quiere llenar:")
    val numeroTazas = readln().toInt()
    var contador = 0

    println("TAZAS:")
    while (contador < numeroTazas){
        contador += 1
        val taza = Taza.nuevaTazaAleatoria()
        listaTazas.add(taza)
        println(taza)
    }

    cafetera1.llenar()
    cafetera2.vaciar()
    cafetera2.agregarCafe(cafetera2.capacidad/2)
    cafetera3.agregarCafe(400)
    println("************************************************************************")

    println(cafetera1)
    println(cafetera2)
    println(cafetera3)

    println("************************************************************************")
    for (taza in listaTazas){
        llenarTazas(cafetera1, cafetera2, cafetera3, taza)
    }

    println("CAFETERAS:")
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)

    println("TAZAS:")
    for (taza in listaTazas){
        println(taza)
    }
}