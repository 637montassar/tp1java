public class Complexe {
    private double pReel;
    private double pIm;
    public Complexe(double pReel,double pIm){
        this.pReel=pReel;
        this.pIm=pIm;

    }
    public Complexe(double pReel){
        this.pReel=pReel;
        this.pIm=0;
    }
    public Complexe(){
        this.pReel = 0;
        this.pIm = 0;
    }
    public double getRe(){
        return pReel; 
    }
    public double getIm(){
        return pIm;  
    }
    public void setRe(double pReel) {
        this.pReel =  pReel;  
    }
    public void setIm(double pIm) {
        this.pIm =  pIm;  
    }
    public double module(){ 
        return Math.sqrt( getRe()* getRe()+ getIm()* getIm());
    }
    public double argument() {
        // ??
    }
    public Complexe oppose(){
        return new Complexe(-getRe(),-getIm());

    }
    public Complexe conjuge(){
        return new Complexe(getRe(),-getIm());
    }
    public Complexe inverse(){
        
    }




    
}
