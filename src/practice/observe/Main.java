package practice.observe;

public class Main {
    
    public static void main(String[] args) {
        Subject s = new Subject();
        new Hex(s);
        new Oct(s);
        
        s.setState(1);
        
        s.setState(10);
    }
}
