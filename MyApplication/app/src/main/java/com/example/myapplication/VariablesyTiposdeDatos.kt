const val numero3= 24f
const val PI= 3.1416
fun main (){
    val numero1=12
    var numero2=34
    numero2 = 20
    println("Numero 1$numero1")
    println("Numero 2 $numero2")
    println("Numero 3 $numero3")
    println("El tipo de datom por defecto es: ${numero2::class.simpleName}")

    val decimal=30
    var perimetro=PI *(decimal*2)
    print("El perimetro cuando el decimal vale $decimal es : $perimetro")

}