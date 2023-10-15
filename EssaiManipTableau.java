public class EssaiManipTableau {
    public static void main(String[] args) {
        ManipTableau tab = new ManipTableau(15); 

        tab.remplir();
        tab.affiche(" # ");
        System.out.println("la moyenne: " + tab.moyenne());
        System.out.println("la somme: " + tab.somme());
        System.out.println("max: " + tab.max());
        System.out.println("min: " + tab.min());

        int val = 98;
        int i = tab.rechercher(val);
        if (i != -1) {
            System.out.println("la valeur " + val + " FOUND! , sur l'indice : " + i+1);
        } else {
            System.out.println("la valeur " + val + " NOT FOUND");
        }
    }
}


