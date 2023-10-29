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
        return (jour+" / "+mois+" / "+annee) ;
    }
    public boolean bissex(){
        return ( (annee % 4==0) && !(annee%100==0) || (annee % 400 == 0) ); 

    }
    public int nbJour(int mois) {
        int s = 0;
        switch (mois) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                s = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                s = 30;
                break;
            case 2:
                if (bissex()) {
                    s = 29;
                } else {
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
        long s=0;
        if ( d1.annee < d2.annee){
            for (int i=d1.annee;i<d2.annee-1;i++){
                if (bissex(i)){
                    s=s+366;
                }
                else{
                    s=s+365;
                }
            }
            s=s+d1.nbJoursRestants();
            s=s+d2.nbJoursEcoules();

        }
        else if (d1.annee > d2.annee){
            for (int i=d2.annee;i<d1.annee-1;i++){
                if (bissex(i)){
                    s=s+366;
                }
                else{
                    s=s+365;
                }
            }
            s=s+d2.nbJoursRestants();
            s=s+d1.nbJoursEcoules();
        }
        else{
            if (d1.mois>d2.mois){
                
                s = 365 - (d1.nbJoursRestants() + d2.nbJoursEcoules() );
                if (bissex(d1.annee)){ s=s+1; }  // less complicated : s = d2.nbJoursEcoules() - d1.nbJoursEcoules();
            
            }
            else if(d2.mois>d1.mois){

                s = 365 - (d2.nbJoursRestants() + d1.nbJoursEcoules() );
                if (bissex(d1.annee)){ s=s+1; } // less complicated : s = d1.nbJoursEcoules() - d2.nbJoursEcoules();
            }
            else{
                s = Math.abs(d2.jour - d1.jour);
            }


        }
        return s;
    }

    
}
