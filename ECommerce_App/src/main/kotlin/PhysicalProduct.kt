class PhysicalProduct(name: String, price: Float, private val weight: Float) : Product(name, price), Shippable {
    override fun get_shipping_cost(): Float {
        return weight * 0.5f
    }
}