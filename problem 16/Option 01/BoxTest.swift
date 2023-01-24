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

        let box2 = Box(length: 5.0, width: 10.0, height: 15.0)
        let volume2 = box2.calculateVolume()
        print("Volume of box2: \(volume2)")

        let box3 = Box(length: 3.0, width: 6.0, height: 9.0)
        let volume3 = box3.calculateVolume()
        print("Volume of box3: \(volume3)")
    }
}


