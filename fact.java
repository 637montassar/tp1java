public class fact {
    public static void main(String[] args) {
        int k=1;
        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            k=k*i;
            System.out.println("factorielle de "+i+" est "+k);
        }
        
    }
    
}
