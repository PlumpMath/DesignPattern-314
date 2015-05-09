package practice.observe;

public class Oct extends Observer {

    public Oct(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Oct: " + Integer.toOctalString(subject.getState()));
    }
    
}
