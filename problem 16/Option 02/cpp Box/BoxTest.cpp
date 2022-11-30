#include <iostream>
#include "Box.hpp"

int main(){

    Box mid = Box(8, 6, 3);
    std::cout << "The volume is : " << mid.calculateVolume() << std::endl;
    return 0;
}