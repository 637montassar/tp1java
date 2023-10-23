

public class EssaiPile {
    public static void main(String[] args) {
        Pilee p = new Pilee(10);
        p.empiler(4);
        p.empiler(6);
        p.empiler(17);
        p.empiler(0);
        p.ListerPile();
        int x = p.depiler();
        System.out.println("la valeur depilé : "+x);
        p.ListerPile();

    }
    
}
