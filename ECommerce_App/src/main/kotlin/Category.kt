abstract class Category(val name: String) {
    private val products: MutableList<Product> = mutableListOf()

    fun add_product(product: List<Product>) {
        products.addAll(product)
    }

    fun get_products(): List<Product> {
        return products.toList()
    }

    abstract fun get_category_name(): String
}