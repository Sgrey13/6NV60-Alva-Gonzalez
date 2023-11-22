abstract class travel {

    abstract val country: String
    abstract val city: String
    protected val serviceType = "Viaje"
    protected var reserved = false
    protected var paidamount = 0
    abstract fun quotePrice(numDays: Int)

    protected abstract fun getPrice(numDays: Int):Int

    fun reserve(numDays: Int) {
        if(reserved){
            println("""Reservaste tu viaje" +
                    Pais: $country
                    Ciudad: $city
                    Precio: $paidamount""".trimMargin())
            return
        }
        val amount=getPrice(numDays)
        if (amount==0){
            return
        }
        reserved=true
        paidamount= amount
        println("""Viaje reservado exitosamente
            Pais: $country
            Ciudad: $city
            Precio: $paidamount""".trimMargin())
    }
}