/**
 *  Múltiples Constructores
 **/

class Futbolista (var nombre: String, var apellido: String, var esTop: Boolean) {

    // El 2do constructor debe llamar obligatoriamente al constructor principal, usando "this"
    constructor(nombre: String, apellido: String): this(nombre, apellido, false) {
        println("2do Constructor: esTop es FALSO por defecto")
    }

    constructor(nombre: String): this(nombre, "Desconocido"){
        println("3er Constructor: apellido es desconocido por defecto")
    }

    fun mostrarNombreCompleto() {
        println("$nombre $apellido")
    }
    fun mostrarSiEsTop() {
        if (esTop){
            println("$nombre es top mundial")
        } else {
            println("$nombre es un completo desconocido")
        }
    }
}

