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
}
