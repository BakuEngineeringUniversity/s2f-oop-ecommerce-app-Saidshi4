class Clothing() {
    private val tShirt = PhysicalProduct("T-shirt", 20f, 0.150f)
    private val jeans = PhysicalProduct("Jeans", 50f, 0.500f)
    private val dress = PhysicalProduct("Dress", 70f, 0.700f)
    private val sweater = PhysicalProduct("Sweater", 45f, 0.400f)
    private val shorts = PhysicalProduct("Shorts", 30f, 0.250f)
    private val hoodie = PhysicalProduct("Hoodie", 60f, 0.600f)
    private val skirt = PhysicalProduct("Skirt", 35f, 0.300f)
    private val blouse = PhysicalProduct("Blouse", 40f, 0.350f)
    private val jacket = PhysicalProduct("Jacket",80f,800f)
    private val sweatpants = PhysicalProduct("Sweatpants", 25f, 0.350f)

    val clothing = listOf(
        tShirt,
        jeans,
        dress,
        sweater,
        shorts,
        hoodie,
        skirt,
        blouse,
        jacket,
        sweatpants
    )
}