package practice.observe;

public class Hex extends Observer{
    
    public Hex(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Hex: " + Integer.toHexString(subject.getState()));
    }

}
