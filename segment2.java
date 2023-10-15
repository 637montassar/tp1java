public class segment2 {
    private int extr1;
    private int extr2;

    public int getExtr1(){
        return extr1;
    }
    public int getExtr2(){
        return extr2;
    }
    void setExtr1(int a ){
        this.extr1=a;
    }
    void setExtr2(int a){
        this.extr2=a;
    }

    /* Constructor */
    segment2(int extr1, int extr2) {
        setExtr1(extr1);
        setExtr2(extr2);
    }
    void ordonne() {
        if (getExtr2() > getExtr1()) {
            int temp = getExtr1();
            setExtr1(getExtr2());
            setExtr2(temp);
        }
    }
    
    boolean appartient(int x){
        return (x >= getExtr1() && x <= getExtr2());
    }
    
    @Override
    public String toString(){
        return ("segment ["+getExtr1()+","+getExtr2()+"]");
    }
    int longeur(){
        return Math.abs(getExtr1()-getExtr2());
    }

}
