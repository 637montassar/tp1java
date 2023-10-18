class EssaiVecteur{
    public static void main(String[] args) {
        if (args.length!=4)
        {
            System.out.println("Les coordonnées sont invalide ! , Veuillez entrez 4 entiers relatifs ");
        }
        else {
        try {
            
        Vecteur v1= new Vecteur(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        Vecteur v2= new Vecteur(Integer.parseInt(args[2]),Integer.parseInt(args[3]));

        System.out.println("v1 : "+v1);
        System.out.println("La longeur du "+v1+": "+v1.longeur());
        System.out.println("v2 : "+v2);
        System.out.println("La longeur du "+v2+": "+v2.longeur());
        

        if (v1.PlusPetitQue(v2)){
            System.out.println("le "+v1+" est plus petit que le "+v2);
        } 
        else if (v2.PlusPetitQue(v1)){
            System.out.println("le "+v2+" est plus petit que le "+v1);
        }
        else {
            System.out.println("les deux vecteurs sont egaux"); // cas d'egalité
        }

        v1.addition(v2); 
        System.out.println("v1 aprés addition de v2 : "+v1);
        
        
        Vecteur v3 = Vecteur.addition(v1, v2); // Vecteur v3
        System.out.println("v3 = v1 + v2 : "+v3);
        }

        catch (NumberFormatException e ){
            System.out.println("les coordonnées doivent etre des entiers relatifs !");
        } // gestion d'exception

        }
    }
    
}