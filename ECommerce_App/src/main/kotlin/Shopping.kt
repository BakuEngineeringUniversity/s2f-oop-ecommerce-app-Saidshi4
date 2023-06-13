class Shopping {
    private val items: MutableList<Product> = mutableListOf()

    fun addItem(item: Product) {
        items.add(item)
    }


    private fun getTotalCost(): Float {



        var totalCost = 0f

        items.forEach {
            totalCost += it.price

            if (it is Shippable) {
                totalCost += it.getShippingCost()
            }
        }
        return totalCost
    }

    fun printReceipt() {

        println("ITEM\t\tPRICE")
        items.forEach {
            print("${it.name}\t\t${it.price}")
            if (it is Shippable) {
                println("\t\t${it.getShippingCost()}")
            }
            else {
                println()
            }
        }

        println("TOTAL COST:\t${getTotalCost()}")
    }


}

