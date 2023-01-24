class Box(val length: Double, val width: Double, val height: Double) {
    fun calculateVolume(): Double {
        return length * width * height
    }
}


fun main() {
    val box1 = Box(10.0, 20.0, 30.0)
    val volume1 = box1.calculateVolume()
    println("Volume of box1: $volume1")

    val box2 = Box(5.0, 10.0, 15.0)
    val volume2 = box2.calculateVolume()
    println("Volume of box2: $volume2")

    val box3 = Box(3.0, 6.0, 9.0)
    val volume3 = box3.calculateVolume()
    println("Volume of box3: $volume3")
}
