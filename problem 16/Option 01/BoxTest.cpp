#include <iostream>

class Box{
    private:
        float length;
        float height;
        float width;

    public:
        Box(float h, float w, float l){
            length = l;
            height = h;
            width = w;
        }
        float calculateVolume(){
            return (width * height * length);
        }
};

int main(){
    Box mid = Box(7, 8, 3);
    std::cout << "The volume of a box is : " << mid.calculateVolume() << std::endl;
    return 0;
}

// on cmd navigated DIR just write " g++ BoxTest.cpp -o BoxTest && BoxTest " if you have DevC++/CodeBlocks run app on your machine