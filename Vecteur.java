public class Vecteur{
    int abscisse, ordonnee ;

    public Vecteur(int abscisse,int ordonnee ){
        this.abscisse = abscisse;
        this.ordonnee  = ordonnee ;
    } 

    public double longeur(){
        return (Math.sqrt(abscisse * abscisse + ordonnee  * ordonnee ));
    }

    public boolean PlusPetitQue(Vecteur v){
        return this.longeur() < v.longeur();
    }

    public void addition (Vecteur v){
        this.abscisse += v.abscisse;
        this.ordonnee += v.ordonnee ;
    } /*Addition du vecteur a un autre */
    
    public static Vecteur addition(Vecteur i,Vecteur j ){
        return new Vecteur(i.abscisse + j.abscisse, i.ordonnee + j.ordonnee );

    } /*Addition de deux vecteurs et retourner le vecteur somme */

    @Override
    public String toString(){
        return ("vecteur ("+ abscisse +", "+ ordonnee  +")"); 
    } /* La redefinition du methode toString()  */
}