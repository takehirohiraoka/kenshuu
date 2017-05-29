package src.main.java;

public class Flowchar1 {

	public static void main(String[] args) {
		Fizzbazz();
	}

	static void Fizzbazz() {
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("Fizzbazz");
				}
				else {
					System.out.println("Fizz");
				}
			}
			else if (i % 5 == 0) {
				System.out.println("bazz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}