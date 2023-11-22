package clases

class Persona(val nombre: String, val apellidos : String,val sexo: String, val altura: Float) {
    override fun toString(): String {
        return "Persona(nombre='$nombre', apellidos='$apellidos', sexo='$sexo', altura='$altura Mts')"
    }
}