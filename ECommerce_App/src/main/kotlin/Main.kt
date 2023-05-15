import java.util.Scanner

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

    for ((i, category) in categories.withIndex()) {
        println("$i. Category: ${category.get_category_name()}")
        val products = category.get_products()
        for ((j, product) in products.withIndex()) {
            println("  $j. Product: ${product.name}, Price: ${product.price}$")
        }
    }

    println("*****************************************************************")
    println("Make your choice. What items will you buy?")
    val shopping = Shopping()
    var sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    for ((i, category) in categories.withIndex()) {
        val products = category.get_products()
        for ((j,product) in products.withIndex()){
            if (i == n && j == m){
                shopping.addItem(product)
            }
        }
    }
    shopping.printReceipt()


}

