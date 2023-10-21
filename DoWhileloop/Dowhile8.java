import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i = 1;
		int sume = 0, sumo = 0;
		do {
			if (i % 2 == 0) {
				sume += i;

			} else {
				sumo += i;

			}
			i++;
		} while (i <= n);
		System.out.println("Sum even" + sume);
		System.out.println("Sum odd" + sumo);
	}
}
