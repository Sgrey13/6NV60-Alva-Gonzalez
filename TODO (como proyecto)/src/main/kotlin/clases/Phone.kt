package clases

class Phone {
    var isOn = false


    fun turnOn(){
        isOn = true
    }

    fun isOff(){
        isOn = false
    }

    fun getTurn(){
        if(isOn){
            println("Encendio el telefono")
        }else{
            println("Esra apgado")
        }
    }

}