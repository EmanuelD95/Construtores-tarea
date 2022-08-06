class Superheroe (var nombre: String, var poder: String, var puedeVolar: Boolean ) {

    constructor(nombre: String, poder: String) : this(nombre, poder, false) {
        println("2do Constructor: puedeVolar es FALSO por defecto")
    }

    constructor(nombre: String) : this(nombre, "Superfuerza") {
        println("3er Constructor: poder es SUPERFUERZA por defecto")
    }

    fun mostrarNombreYSuperPoder() {
        println("$nombre $poder")
    }
    fun mostrarSiPuedeVolar() {
        if (puedeVolar){
            println("$nombre puede volar")
        } else {
            println("$nombre este no vuela")
        }
    }
}

/**
 * TAREA-3:
 * Crear una clase "Superheroe" con 3 constructores y atributos:
 * Constructor primario: nombre, poder, puedeVolar
 * 2do constructor: nombre, poder, puedeVolar=false
 * 3er constructor: nombre, poder="superfuerza"
 *
 * En el 2do Constructor imprimir: "2do Constructor: puedeVolar es FALSO por defecto"
 * En el 2do Constructor imprimir: "3er Constructor: poder es SUPERFUERZA por defecto"
 *
 * Crear funciones:
 * mostrar nombre y superpoder
 * mostrar si puede volar
 */
