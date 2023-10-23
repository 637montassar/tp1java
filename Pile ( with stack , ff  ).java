import java.util.Stack;

class PileA {
    private Stack<Integer> stack;
    private int max;

    public PileA(int max) {
        stack = new Stack<>();
        this.max = max;
    }

    public PileA() {
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