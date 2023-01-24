type Box struct {
    length float64
    width  float64
    height float64
}

func (b Box) CalculateVolume() float64 {
    return b.length * b.width * b.height
}


func main() {
    box1 := Box{10, 20, 30}
    volume1 := box1.CalculateVolume()
    fmt.Println("Volume of box1:", volume1)

    box2 := Box{5, 10, 15}
    volume2 := box2.CalculateVolume()
    fmt.Println("Volume of box2:", volume2)

    box3 := Box{3, 6, 9}
    volume3 := box3.CalculateVolume()
    fmt.Println("Volume of box3:", volume3)
}
