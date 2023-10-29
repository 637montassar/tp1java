public class EssaiDate {
    public static void main(String[] args) {
        System.out.println(Datee.bissex(1900));
        System.out.println(Datee.bissex(1920));
        System.out.println(Datee.bissex(1989));
        System.out.println(Datee.bissex(2000));
        System.out.println(Datee.bissex(2003));
        Datee d= new Datee(3, 2, 2003);
        System.out.println("au " +d);
        System.out.println(d.nbJoursEcoules());
        System.out.println(d.nbJoursRestants());
        System.out.println(Datee.nbJoursEntre(new Datee(1, 1, 1900),new Datee(1, 1, 2000)));


    }
    
}
