abstract class Category(val name: String) {
    private val products: MutableList<Product> = mutableListOf()

    fun addProduct(product: List<Product>) {
        products.addAll(product)
    }

    fun getProducts(): List<Product> {
        return products.toList()
    }

    abstract fun getCategoryName(): String
}