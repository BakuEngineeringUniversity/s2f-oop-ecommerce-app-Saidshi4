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




    for ((i,category) in categories.withIndex()) {
        println("$i. Category: ${category.get_category_name()}")
        val products = category.get_products()

        for ((j, product) in products.withIndex()) {
            println("  $j. Product: ${product.name}, Price: ${product.price}$")
        }
    }
    val shopping = Shopping()

    println("*****************************************************************")
    val t = clothing.tShirt
    val e = electronicDevice.eReader
    val b = homeGood.bedFrame
    shopping.addItem(t)
    shopping.addItem(e)
    shopping.addItem(b)

    shopping.printReceipt()


}

