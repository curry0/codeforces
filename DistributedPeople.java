import java.util.Scanner;

public class DisturbedPeople {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i = 0; i<n;i++) {
			a[i] = scan.nextInt();
		}
		int counter = 0;
		for(int i = 1; i < a.length-1; i++) {
				if( a[i] == 0 && a[i-1] == 1 && a[i+1] == 1) {
					counter++;
					a[i+1] = 0;
				}
		}
			System.out.println(counter);

	}
}
