public  class Argu {

    private int bin;
    private String pre;
    protected int nary;

    public int argManu() {
        return bin;
    }

    public void setBin(int val){
        this.bin = val;
    }

    public String argManu(String ar) {
        return new String(bin);
    }
}