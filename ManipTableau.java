import java.util.Random;
public class ManipTableau
{
    private int[] tab ;
    ManipTableau(int n){
        tab = new int[n];
    }
    void remplir(){
        Random random = new Random(); /*Objet random*/
        for (int i = 0; i < tab.length; i++) {
            tab[i]=random.nextInt(100);
        }
    }
    public int somme(){
        int s=0;
        for (int i = 0; i < tab.length; i++) {
            s+=tab[i];
        }
        return s;
    }
    public float moyenne(){
        return (float) this.somme() / tab.length;
    }
    public int max(){
        int m=0;
        for (int i = 0; i < tab.length; i++) {
            if(m<tab[i]){
                m=tab[i];
            }
        }
        return m;
    }
    public int min(){
        int m=100;
        for (int i = 0; i < tab.length; i++) {
            if(m>tab[i]){
                m=tab[i];
            }
        }
        return m;
    }
    public int rechercher(int e){
        for (int i = 0; i < tab.length; i++) {
            if(e==tab[i]){
                return i;
            }
        }
        return -1;
    }
    void affiche(String s){
        String all="";
        for (int i = 0; i < tab.length; i++) {
            all += Integer.toString(tab[i]) + s;
        }
        System.out.println(all.substring(0,all.length()-1));
    }

}