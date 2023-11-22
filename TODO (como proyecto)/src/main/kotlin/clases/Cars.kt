package clases

class Cars {

    var color = ""
    var marca = ""
    var modelo = ""
    var placas = ""
    var gasolina = 0f
    var encendido = false

    constructor(placas: String, gasolina: Float, encendido: Boolean) {
        this.placas = placas
        this.gasolina = gasolina
        this.encendido = encendido
    }


    fun enceder() {
        encendido = true
    }
    fun apagar(){
        encendido = false
    }

    fun recragar(litros : Float){
        gasolina += litros
    }



    override fun toString(): String {
        return "Cars(color='$color', marca='" +
                "$marca', modelo='$modelo', placas='$placas', " +
                "gasolina=$gasolina, encendido=$encendido)"
    }
}