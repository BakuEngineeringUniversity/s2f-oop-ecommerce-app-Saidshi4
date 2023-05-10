fun main() {
    val hpPavilion = PhysicalProduct("HP Pavilion", 600f, 1.85f)
    val  zFlip3= PhysicalProduct("Samsung Galaxy Z Flip 3", 999f, 0.183f)
    val ebook = DigitalProduct("The Da Vinci Code", 9.99f)
    val sneakers = PhysicalProduct("Adidas Ultra-boost 21", 180f,0.3f)
    val lamp = PhysicalProduct("Table Lamp",14f,0.5f)

    val electronics = ElectronicsCategory()
    electronics.add_product(hpPavilion)
    electronics.add_product(zFlip3)

    val clothing = ClothingCategory()
    clothing.add_product(sneakers)


    val homeGoods = HomeGoodsCategory()
    homeGoods.add_product(ebook)
    homeGoods.add_product(lamp)

    val categories = listOf(electronics, clothing, homeGoods)

    for (category in categories) {
        println("Category: ${category.get_category_name()}")
        val products = category.get_products()
        for (product in products) {
            println("  Product: ${product.name}, Price: ${product.price}$")
            if (product is Shippable) {
                println("    Shipping cost: ${product.get_shipping_cost()}$")
            }
        }
    }
}