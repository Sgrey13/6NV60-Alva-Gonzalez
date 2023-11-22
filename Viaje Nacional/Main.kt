fun main(){
    val viajemonterrey=National("Monterrey")
    viajemonterrey.quotePrice(4)
    viajemonterrey.reserve(4)
    val viajeMonterreyDescuento = NationalLowSeason("Monterrey")
    viajeMonterreyDescuento.reserve(4)
}



