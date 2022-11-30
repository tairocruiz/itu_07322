
class Box() {
    var length:Int
    var width:Int
    var height:Int

    constructor(hg:Int, ln:Int, wd:Int){
        length = ln
        width = wd
        height = hg
    }
    fun calculateVolume() {
        return length*width*height
    }
}

fun main(args: Array<String>) {
    val myBox = Box(7, 8, 3)
    println("The volume of a box is : ${myBox.calculateVolume()}") 
}