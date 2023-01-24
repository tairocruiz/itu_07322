Public Class Box
    Private _length As Double
    Private _width As Double
    Private _height As Double

    Public Sub New(ByVal l As Double, ByVal w As Double, ByVal h As Double)
        _length = l
        _width = w
        _height = h
    End Sub

    Public Function CalculateVolume() As Double
        Return _length * _width * _height
    End Function
End Class


Module BoxText
    Sub Main()
        Dim box1 As New Box(10, 20, 30)
        Dim volume1 As Double = box1.CalculateVolume()
        Console.WriteLine("Volume of box1: " & volume1)

        Dim box2 As New Box(5, 10, 15)
        Dim volume2 As Double = box2.CalculateVolume()
        Console.WriteLine("Volume of box2: " & volume2)

        Dim box3 As New Box(3, 6, 9)
        Dim volume3 As Double = box3.CalculateVolume()
        Console.WriteLine("Volume of box3: " & volume3)
    End Sub
End Module
