import java.util.Stack;


public class Pile{
    private Stack<Integer> stack;
    private int max;

    public Pile(int max) {
        stack = new Stack<>();
        this.max = max;
    }

    public Pile() {
        this(100); 
    }
    public void emplier(int n){
        stack.push(n);
    }
    public void depiler(){
        if (!estVide()) {
            stack.pop();
        }
    }
    public boolean estVide(){
        return stack.isEmpty();
    }
    public boolean estPleine(){
        return stack.size()==max;
    }
    public void ListerPile() {
        
        while (!estVide()) {
            System.out.println(stack.pop());
        }
    }
    
}