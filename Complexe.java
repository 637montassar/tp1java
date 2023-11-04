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
        return Math.sqrt( pReel* pReel+ pIm* pIm);
    }
    public double argument() {
        if (module()!=0){
            return (pReel/module());
        }
        else{
            return 0;
        }
    }
    public Complexe oppose(){
        return new Complexe(-pReel,-pIm);

    }
    public Complexe conjuge(){
        return new Complexe(pReel,-pIm);
    }
    public Complexe inverse(){
        if (pIm != 0 ||  pReel != 0 ){
            return new Complexe(1/pReel, 1/pIm);
        }
        else{
            return new Complexe();
        }
    }
    public Complexe plus(Complexe c){
        return new Complexe(pReel+c.getRe(),pIm + c.getIm());
    }
    public Complexe moins(Complexe c){
        return new Complexe(pReel - c.getRe(),pIm - c.getIm());
    }
    public Complexe multiplier(Complexe c){
        return new Complexe(pReel * c.getRe(),pIm * c.getIm());
    }
    public Complexe diviser(Complexe c){
        if (c.getRe() != 0 && c.getIm() !=0 )
            return new Complexe(pReel/c.getRe(),pIm/c.getIm());
        else{
            return new Complexe();
        }
    }
    

    // Statics 
    public static Complexe creerC(double pReel,double pIm){
        return new Complexe(pReel, pIm);
    }
    public static Complexe plus(Complexe c1, Complexe c2){
        return new Complexe(c1.getRe()+c2.getRe(), c1.getIm() + c2.getIm());
    }
    public static Complexe moins(Complexe c1, Complexe c2){
        return new Complexe(c1.getRe()-c2.getRe(), c1.getIm() - c2.getIm());
    }
    public static Complexe multiplier(Complexe c1, Complexe c2){
        return new Complexe(c1.getRe()*c2.getRe(), c1.getIm() * c2.getIm());
    }
    public static Complexe diviser(Complexe c1 , Complexe c2){
        if (c2.getRe() != 0 && c2.getIm() !=0 )
            return new Complexe(c1.getRe()/c2.getRe(),c1.getIm()/c2.getIm());
        else{
            return new Complexe();
        }
    }

    @Override
    public String toString(){
        return pReel+" + "+pIm+" i";

    }






    
}
