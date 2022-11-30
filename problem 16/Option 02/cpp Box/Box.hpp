/**
 * @author T.cruiz.
 * @since Nov 2022.
 * 
 * @brief A class Module/Blueprint for instating a box class 
 */
class Box{
    private:
        double length;
        double height;
        double width;

    public:
        Box(double h, double w, double l){
            length = l;
            height = h;
            width = w;
        }
        /**
         * @brief Methods for calculating a volume of a box
         * 
         * @return double 
         */
        double calculateVolume(){
            return (width * height * length);
        }
};