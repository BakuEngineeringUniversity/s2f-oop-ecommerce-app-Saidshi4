class ElectronicDevice{
    private val laptop = PhysicalProduct("Laptop", 600f, 1.85f)
    private val smartphone =PhysicalProduct("Smartphone",500f, 0.2f)
    private val tablet =PhysicalProduct("Tablet",400f, 0.5f)
    private val smartwatch =PhysicalProduct("Smartwatch",200f, 0.05f)
    private val headphones =PhysicalProduct("Headphones",150f, 0.2f)
    private val camera =PhysicalProduct("Camera",600f, 0.5f)
    private val gamingConsole =PhysicalProduct("Gaming Console",400f, 2.5f)
    private val charger =PhysicalProduct("Charger",50f, 0.3f)
    private val speaker =PhysicalProduct("Speaker",100f, 1f)
     val eReader =DigitalProduct("E-reader",50f)

    val devices = listOf(
        laptop,
        smartphone,
        tablet,
        smartwatch,
        headphones,
        camera,
        gamingConsole,
        charger,
        speaker,
        eReader
    )


}