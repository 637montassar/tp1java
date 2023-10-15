public class segment {
    int extr1;
    int extr2;
    segment(int extr1,int extr2){
        this.extr1=extr1;
        this.extr2=extr2;
    }
    void ordonne(){
        if (extr2>extr1){
            int tmp=extr1;
            extr1=extr2;
            extr2=tmp;
        }
    }
    boolean appartient(int x){
        return (x<=extr1 && x>=extr2);
    }
    @Override
    public String toString(){
        return ("segment ["+extr2+","+extr1+" ]");
    }
    int longeur(){
        return Math.abs(extr1-extr2);
    }

}
