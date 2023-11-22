class NationalLowSeason (city:String):National(city),IPromotion{
    override val discount: Int=10
    override val typeDiscount: Int=0
    override fun getPrice(numDays: Int): Int {
        val amount=super.getPrice(numDays)
        return if (amount==0) 0 else getDiscountPrice(amount)
    }

}