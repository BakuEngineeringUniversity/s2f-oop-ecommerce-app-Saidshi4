class ElectronicsCategory : Category("Electronics") {
    override fun getCategoryName(): String {
        return "e-"+name
    }
}