public class palin1 {
    public static void main(String[] args) {
        if (args.length!=1){
            System.out.println("Vous devez entrez une seule chaine");

        }
        else{
        String s=args[0];
        System.out.println("l inverse de "+s+" est "+ inverse(s));
        if (s.equals(inverse(s))){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("NO!");
        }}
        
    }
    public static String inverse(String s){
        char[] envers =new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            envers[i]=s.charAt(s.length()-i-1);
        }
        return new String(envers);
    }
    
}
