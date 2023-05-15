class Shopping {
    private val items: MutableList<Product> = mutableListOf()

    fun addItem(item: Product) {
        items.add(item)
    }

    private fun getTotalCost(): Float {
        var totalCost = 0f

        items.forEach {
            totalCost += it.price
        }
        return totalCost
    }

    fun printReceipt() {

        println("ITEM\t\tPRICE")
        items.forEach {
            println("${it.name}\t\t${it.price}")
        }

        println("TOTAL COST:\t${getTotalCost()}")
    }
}

