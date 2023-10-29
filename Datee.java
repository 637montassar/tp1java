public class Datee {
    int jour ;
    int mois ;
    int annee ;
    public Datee(int jour ,int mois , int annee ){
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;

    }
    @Override
    public String toString(){
        return (jour+" / "+mois+" / "+" annee ") ;
    }
    public boolean bissex(){
        return ( (annee % 4==0) && !(annee%100==0) || (annee % 400 == 0) ); 

    }
    public int nbJour(int mois) {
        int s=0;
        switch (mois) {
            case 1, 3, 5, 7, 8, 10, 12:
                s = 31;
                break;
            case 4, 6, 9, 11:
                s = 30;
                break;
            case 2:
                if (bissex()) {
                    s = 29;
                } 
                else {
                    s = 28;
                }
                break;
        }
        return s;
    }
    
    public int nbJoursEcoules(){
        int s=0;
        for (int i = 1; i<mois;i++){
            s+=nbJour(i);
        }
        return (s+jour);

    }
    public int nbJoursRestants(){
        if(bissex()){
            return 366-nbJoursEcoules();
        }
        else{
            return 365-nbJoursEcoules();
        }
    }
    public static boolean bissex(int year){
        return ( (year % 4==0) && !(year%100==0) || (year % 400 == 0) ); 

    }
    public static long nbJoursEntre(Datee d1, Datee d2){
        
    }

    
}
