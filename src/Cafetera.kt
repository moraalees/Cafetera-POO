package src

class Cafetera(val ubicacion: String) {

    private var capacidad = 1000
    private var cantidad = 0

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
        cantidad = capacidad
    }

    fun vaciar(){
        cantidad = 0
    }

    fun servirTaza(taza: Taza){

    }

    fun agregarCafe(cantidadAgregada: Int){
        val cantidadFinal = cantidad + cantidadAgregada

        if (cantidadFinal > capacidad) {
            cantidad = capacidad
        } else {
            cantidad = cantidadFinal
        }
    }


    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }

}