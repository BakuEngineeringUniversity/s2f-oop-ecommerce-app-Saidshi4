class Shopping {


    private val items: MutableList<Product> = mutableListOf()

    fun addItem(item: PhysicalProduct) {
        items.add(item)
    }
    fun addItem(item: DigitalProduct){
        items.add(item)
    }


    fun getTotalCost(): Float {
        var totalCost = 0f
        items.forEach {
            totalCost += it.price
        }
        return totalCost
    }

    fun printReceipt() {

        println("ITEM\t\tPRICE\t\tWEIGHT")
        items.forEach {
            println("${it.name}\t${it.price}")
        }
        println("TOTAL COST:\t${getTotalCost()}")
    }
}

