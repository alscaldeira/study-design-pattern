package designpatterns.singleton;

public class Main {

	public static void main(String[] args) {
		Database a = Database.getInstance();
		Database b = Database.getInstance();
		
		System.out.println(a == b);
	}
	
}
