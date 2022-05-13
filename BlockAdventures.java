import java.util.Scanner;

public class BlockAdventure {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		while (t > 0) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int k = scan.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
			System.out.println(calculate(a,m,k));
			t--;
		}
	}
	public static String calculate(int arr[], int m, int k) {

		boolean result = true;
		int x;
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			x = Math.max(0, arr[i+1]-k);
			m += arr [i] - x;
			if(m < 0) {
				result = false;
			}
		}
		if (result) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
}
