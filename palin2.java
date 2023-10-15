import java.util.Scanner;
public class palin2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez une chaine = ");
        String s=input.nextLine();
        System.out.println("l inverse de "+s+" est "+ inverse(s));
        if (s.equals(inverse(s))){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("NO!");
        }
        input.close();
    }
    public static String inverse(String s){
        char[] envers =new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            envers[i]=s.charAt(s.length()-i-1);
        }
        return new String(envers);
    }
    
}
