<?php
class Box{
    private $length;
    private $width;
    private $height;

    public function __construct(float $ln, float $hg, float $wd){
        $this->length = $ln;
        $this->width = $wd;
        $this->height = $hg;
    }

    public function calculateVolume(): float {
        return ($this->length * $this->width * $this->height);
    }

}

$BoxTest = new Box(7, 8, 3);
echo ("The volume of a box is : ".$BoxTest->calculateVolume());


//  on cmd navigated DIR just write " php BoxTest.php " if you have php run app on your machine.
?>
