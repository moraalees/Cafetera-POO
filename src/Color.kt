package src

enum class Color {
    Blanco,
    Negro,
    Gris,
    Azul,
    Verde;

    companion object{
        fun generarColorAleatorio(): Color{
            return entries.toTypedArray().random()
        }
    }
}