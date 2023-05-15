class PhysicalProduct(name: String, price: Float, private val weight: Float) : Product(name, price), Shippable {
    override fun getShippingCost(): Float {
        return weight * 0.5f
    }
}