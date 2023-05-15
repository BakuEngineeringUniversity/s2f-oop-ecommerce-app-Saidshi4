import java.util.Scanner

fun main() {
    val electronicDevice = ElectronicDevice()
    val clothing = Clothing()
    val homeGood = HomeGoods()

    val electronicsCategory = ElectronicsCategory()
    electronicsCategory.addProduct(electronicDevice.devices)

    val clothingCategory = ClothingCategory()
    clothingCategory.addProduct(clothing.clothing)

    val homeGoodsCategory = HomeGoodsCategory()
    homeGoodsCategory.addProduct(homeGood.homeGoods)

    val categories = listOf(electronicsCategory, clothingCategory, homeGoodsCategory)

    for ((i, category) in categories.withIndex()) {
        println("$i. Category: ${category.getCategoryName()}")
        val products = category.getProducts()
        for ((j, product) in products.withIndex()) {
            println("  $j. Product: ${product.name}, Price: ${product.price}$")
        }
    }

    println("*****************************************************************")
    println("Make your choice. What items will you buy?")
    val shopping = Shopping()
    val sc = Scanner(System.`in`)

    while (true){
        val s = sc.nextLine()
        if (s == "stop") break
        val n = s[0].digitToInt()
        val m = s[1].digitToInt()
        for ((i, category) in categories.withIndex()) {
            val products = category.getProducts()
            for ((j,product) in products.withIndex()){
                if (i == n && j == m){
                    shopping.addItem(product)
                }
            }
        }
    }
    shopping.printReceipt()
}

