#!python
class Box:
    length: float
    height: float
    width: float

    def __init__(self, h: float, l: float, w: float):
        self.length = l
        self.height = h
        self.width = w
    
    def calculateVolume(self):
        return (self.length * self.height * self.width)
        

if __name__ == '__main__':
    Boxed = Box(7, 8, 3)
    print("The volume of a box is :", Boxed.calculateVolume())

# on cmd navigated DIR just write " python -u BoxTest.py " if you have python3 run app on your machine.
