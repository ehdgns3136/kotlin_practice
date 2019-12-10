enum class Type(val value: Int) {
    ONE(1),
    TWO(2);

    fun toValue() : Int {
        return this.value
    }
}