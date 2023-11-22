import clases.Cars
import clases.Persona
import clases.Phone

fun main(args: Array<String>) {

    /*var myPhone = Phone()
    myPhone.turnOn()
    myPhone.getTurn()*/

    val miVehiculo = Cars("011-504",40.5F,false)
    miVehiculo.color = "Rojo"
    miVehiculo.marca = "Toyota"
    miVehiculo.modelo = "A11"
    miVehiculo.recragar(35.4F)
    miVehiculo.enceder()

    println(miVehiculo)

    val miPersona = Persona("Luis","Nava","Hombre",1.70f)
    println(miPersona)

}