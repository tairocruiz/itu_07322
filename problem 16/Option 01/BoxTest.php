<?php
class Box{
    private ?float $length;
    private ?float $width;
    private ?float $height;

    public function __construct(float $ln, float $hg, float $wd){
        $this->length = $ln;
        $this->width = $wd;
        $this->height = $hg;
    }

    public function calculateVolume(): float {
        return ($this->length * $this->width * $this->height);
    }

}


class BoxTest {
    public static function main() {
        $box1 = new Box(10, 20, 30);
        $volume1 = $box1->calculateVolume();
        echo "Volume of box1: " . $volume1 . "\n";

        $box2 = new Box(5, 10, 15);
        $volume2 = $box2->calculateVolume();
        echo "Volume of box2: " . $volume2 . "\n";

        $box3 = new Box(3, 6, 9);
        $volume3 = $box3->calculateVolume();
        echo "Volume of box3: " . $volume3 . "\n";
    }
}

BoxTest::main();


//  on cmd navigated DIR just write " php BoxTest.php " if you have php run app on your machine.
?>
