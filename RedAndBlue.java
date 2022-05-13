import java.util.Scanner;

public class RedAndBlue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		while (t > 0) {
			int n = scan.nextInt();
			int r[] = new int[n];
			for (int i = 0; i < n; i++) {
				r[i] = scan.nextInt();
			}
			int m = scan.nextInt();
			int b[] = new int[m];
			for (int i = 0; i < m; i++) {
				b[i] = scan.nextInt();
			}
			t--;
			System.out.println(calculate(r, b));
		}

	}

	public static int calculate(int r[], int b[]) {
		int max1 = 0, sum1 = 0; // max and sum of red array
		int max2 = 0, sum2 = 0; // max and sum of blue array
		for (int i = 0; i < r.length; i++) {
			sum1 = sum1 + r[i];
			r[i] = sum1;
			if (r[i] > max1)
				max1 = r[i];
		}
		for (int i = 0; i < b.length; i++) {
			sum2 = sum2 + b[i];
			b[i] = sum2;
			if (b[i] > max2)
				max2 = b[i];
		}
		return max1 + max2;

	}
}
