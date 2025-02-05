package src

class Cafetera(val ubicacion: String) {

    var capacidad = 1000
    var cantidad = 0

    constructor(ubicacion: String, capacidad: Int): this(ubicacion) {
        this.capacidad = capacidad
        cantidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Int, cantidad: Int): this(ubicacion) {
        this.capacidad = capacidad

        if (cantidad > capacidad) {
            this.cantidad = capacidad
        } else {
            this.cantidad = cantidad
        }
    }

    fun llenar(){
        if (cantidad < capacidad){
            cantidad = capacidad
            println("¡Cafetera llenada con éxito!")
        } else {
            println("La cafetera ya estaba llena...")
        }
    }

    fun vaciar(){
        if (cantidad != 0){
            cantidad = 0
            println("¡Cafetera vaciada con éxito!")
        } else {
            println("La cafetera ya estaba vacía...")
        }
    }

    fun servirTaza(taza: Taza){
        val cantidadQueFalta = taza.capacidad - taza.cantidad
        if (cantidad == 0){
            println("La cafetera está vacía, no se puede llenar la taza.")
        } else {
            if (cantidad < cantidadQueFalta){
                taza.llenar(cantidad)
                cantidad = 0
            } else {
                taza.llenar(cantidad)
                cantidad -= cantidadQueFalta
            }
        }
    }

    fun agregarCafe(cantidadAgregada: Int){
        val cantidadFinal = cantidad + cantidadAgregada

        if (cantidadFinal > capacidad) {
            cantidad = capacidad
            println("Cafetera llenada al 100% '$capacidad c.c.' (la cantidad superaba la capacidad).")
        } else {
            cantidad = cantidadFinal
            println("Cafetera llenada a $cantidadFinal c.c.")
        }
    }


    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }

}