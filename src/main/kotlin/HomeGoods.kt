class HomeGoods {
    private val sofaSet = PhysicalProduct("Sofa Set",1000f,100f)
    private val diningTable = PhysicalProduct("Dining Table",500f,50f)
    private val bedFrame = PhysicalProduct("Bed Frame",800f,80f)
    private val refrigerator = PhysicalProduct("Refrigerator", 1200f,120f)
    private val washingMachine = PhysicalProduct("Washing Machine", 700f,70f)
    private val microwaveOven = PhysicalProduct("Microwave Oven",700f,70f)
    private val tvStand = PhysicalProduct("Tv Stand",200f,20f)
    private val bookShelf = PhysicalProduct("Book Shelf",300f,30f)
    private val coffeeTable = PhysicalProduct("Coffee tbl",150f,15f)
    private val armchair = DigitalProduct("Armchair",250f)

    val homeGoods = listOf(
        sofaSet,
        diningTable,
        bedFrame,
        refrigerator,
        washingMachine,
        microwaveOven,
        tvStand,
        bookShelf,
        coffeeTable,
        armchair
    )
}