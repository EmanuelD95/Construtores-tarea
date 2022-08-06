class Celular constructor(var marca: String = "", var color: String = "", var capacidad: Int = 128) {

    fun tipoDeCelular() {
        println("Marca: $marca - Color: $color - Capacidad: $capacidad Gb")
    }
}

/**
 * TAREA-2:
 * Crear una clase "Celular" con constructor (valores inicializados):
 * marca
 * color
 * capacidad = 128
 *
 * Y una función:
 * mostrar "Marca: $marca - Color: $color - Capacidad: $capacidad"
 */