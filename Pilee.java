
public class Pilee {
    private int sommet;
    private int []pile;
    public Pilee() {
        this(100);
    }
    public Pilee(int max ){
        pile = new int[max];
        sommet = -1;
    }
    private void erreur(String message){
        System.out.println("Erreur :"+message);
    }
    public boolean estVide(){
        return sommet == -1;
    }
    public boolean estPleine(){
        return sommet == pile.length-1 ;
    }
    public void empiler(int n ){
        if (estPleine()){
            erreur("la pile est pleine! ");
        }
        else {
            pile[sommet+1]=n;
            sommet += 1;
            /* pile [++sommet]=n */
            /* sommet ++ ; pile[sommet] = n */
        }
    }
    public int depiler(){
        if (estVide()){
            erreur("la liste est vide ! ");
            return -1;
        }
        else{
            int aux = pile[sommet];
            sommet -- ;
            return aux ;
        }
    }
    public void ListerPile(){
        if (estVide()){
            System.out.println("la liste est vide");
        }
        else {
            int i ;
            System.out.println("la pile est :");
            for (i=sommet; i >= 0 ; i--){
                System.out.println(pile[i]);
            }
        }
    }
    
}
