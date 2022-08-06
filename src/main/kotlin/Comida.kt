/**
 * Init Block
 * (Bloque inicial)
 * Me permite ejecutar en el constructor principal
 */

class Comida (var nombre: String, var paisOrigen: String, var esDelicioso: Boolean) {

    init {
        println("Bloque Init")
    }

    constructor(nombre: String, paisOrigen: String): this(nombre, paisOrigen, false) {
        println("Segundo Constructor")
    }

    fun mostrarNombreYPaisOrigen() {
        println("Nombre: $nombre - Pais de Origen: $paisOrigen - Es delicioso: $esDelicioso")
    }
}