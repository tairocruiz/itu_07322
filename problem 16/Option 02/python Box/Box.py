'''
    @author T.cruiz
    @since Nov 2022
'''

class Box:
    '''
    *** A class Module/Blueprint for instating a box class ***
    '''
    length = 0
    height = 0
    width = 0

    def __init__(self, h: int, l: int, w: int):
        ''' this is how aconstructor is written in python. '''
        self.length = l
        self.height = h
        self.width = w
    
    def calculateVolume(self):
        '''
        #Methods for calculating a volume of a box
        '''
        return (self.length * self.height * self.width)