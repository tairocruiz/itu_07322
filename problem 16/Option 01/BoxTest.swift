class Box {
    var length: Double
    var width: Double
    var height: Double

    init(length: Double, width: Double, height: Double) {
        self.length = length
        self.width = width
        self.height = height
    }

    func calculateVolume() -> Double {
        return length * width * height
    }
}


class BoxText {
    static func main() {
        let box1 = Box(length: 10.0, width: 20.0, height: 30.0)
        let volume1 = box1.calculateVolume()
        print("Volume of box1: \(volume1)")
    }
}


