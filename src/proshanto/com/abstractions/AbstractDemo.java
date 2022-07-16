package proshanto.com.abstractions;

public class AbstractDemo {
	public static void main(String[] args) {
		Salary s = new Salary("Proshanto", "Dhaka, uttara", 3, 3600.00);
		Employee e = new Salary("Roy", "Dhaka, Banani", 2, 2400.00);
		System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();
		System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();
	}
}
