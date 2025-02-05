package src

class Taza(private val color: Color = Color.Blanco, private var capacidad: Int = 50) {

    var cantidad = 0
        set(value){
            require(cantidad <= capacidad){ "La cantidad de café debe ser menor o igual que la capacidad." }
            field = value
        }


    fun llenar(){
        cantidad = capacidad
    }

    fun llenar(cantidadAgregada: Int){
        val cantidadFinal = cantidad + cantidadAgregada

        if (cantidadFinal > capacidad) {
            cantidad = capacidad
        } else {
            cantidad = cantidadFinal
        }
    }

    override fun toString(): String {
        return "Taza(color = ${color}, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }

}