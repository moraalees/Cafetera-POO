package src

class Taza(private val color: Color = Color.Blanco, var capacidad: Int = 50) {
    companion object{

        fun nuevaTazaAleatoria(): Taza{
            val taza = Taza(color = Color.values().random(), capacidad = listOf(50, 75, 100).random())
            return taza
        }

    }

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