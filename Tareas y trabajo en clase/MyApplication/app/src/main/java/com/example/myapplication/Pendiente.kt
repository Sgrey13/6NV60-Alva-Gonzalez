
fun main (){

    println("Ingresa el valor de Y2 ")
    val y2 :Int = readln().toInt()
    println("Ingresa el valor de Y1 ")
    val y1 :Int = readln().toInt()
    println("Ingresa el valor de X2 ")
    val x2 :Int = readln().toInt()
    println("Ingresa el valor de X1 ")
    val x1 :Int = readln().toInt()

    var numerador= y2.minus(y1)
    var denominador=x2-x1

    var pendiente:Float=numerador.toFloat()/denominador.toFloat()
    var pendf:Int=numerador/denominador
    println("Valor de la pendiente es: $pendiente")
    println("Valor de la pendiente infomcleto o entero es: $pendf")





}