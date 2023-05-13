
fun main() {
    val electronicDevice = ElectronicDevice()
    val clothing = Clothings()
    val homeGood = HomeGoods()

    val electronicsCategory = ElectronicsCategory()
    electronicsCategory.add_product(electronicDevice.devices)

    val clothingCategory = ClothingCategory()
    clothingCategory.add_product(clothing.clothings)

    val homeGoodsCategory = HomeGoodsCategory()
    homeGoodsCategory.add_product(homeGood.homeGoods)

    val categories = listOf(electronicsCategory, clothingCategory, homeGoodsCategory)


//hello brooo

    for (category in categories) {
        println("Category: ${category.get_category_name()}")
        val products = category.get_products()

        for ((index, product) in products.withIndex()) {
            println("  $index. Product: ${product.name}, Price: ${product.price}$")
        }
    }

}

