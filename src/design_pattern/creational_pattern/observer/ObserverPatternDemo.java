package design_pattern.creational_pattern.observer;

import java.util.Scanner;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject mySubject = new Subject();
		
		new BinaryObserver(mySubject);
		new OctalObserver(mySubject);
		new HexObserver(mySubject);
		
		while (true) {
			System.out.println("Enter new state (Integer)>>");
			Scanner in = new Scanner(System.in);
			String myState= in.nextLine();
			Integer s = Integer.parseInt(myState);
			mySubject.setState(Integer.parseInt(myState));
		}
		
	}

}
