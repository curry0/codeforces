
import java.util.Scanner;

public class RemoveSmallest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t > 0) {
			int n = scan.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
			t--;
			calculate(a);
		}
	}

	public static void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void calculate(int arr[]) {
		sort(arr);
		boolean check = true;
		for (int i = 1; i < arr.length; i++) {
			boolean absDifference = arr[i] - arr[i - 1] <= 1; 
			check = check && absDifference;
		}
		if (!check)
			System.out.println("NO");
		else
			System.out.println("YES");

	}

}
