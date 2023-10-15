class essai{
    public static void main(String[] args){
        if (args.length!=3){
            System.out.println("Veuillez entré 3 paramétres");
        }
        else{
            
        
        try {
            segment seg = new segment(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
            int z=Integer.parseInt(args[2]);
        seg.ordonne();
        System.out.println("la longuer du segment = "+seg.longeur());
        if (seg.appartient(z)){
            System.out.println(z+" appartient au "+seg);
        }
        else {
            System.out.println(z+" n'appartient pas au "+seg);

        }
        
        }
        catch (java.lang.NumberFormatException e){
            System.out.println("Veuillez entré des nombres seulement");
        }
    
    
    }
    }




}
