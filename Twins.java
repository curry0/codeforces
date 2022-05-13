import java.util.Scanner;

public class Twins {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int arr[] = new int[input];
		for(int i = 0; i < input; i++) {
			arr[i] = scan.nextInt();
		}
		sort(arr);

		calculate(arr);
	}
			  public static void sort(int arr[])
			    {
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

			  
			    public static void calculate(int a[]) {
			    	sort(a);
			    	int counter = 1;
			    	int sum = 0;
			    	int num = a[a.length-1];

			    	for (int i = 0; i < a.length; i++) {
			    		sum = sum+a[i];
			    		
			    		if (num <= sum - num) {
			    		
			    			num = num + a[a.length-1-counter];
			    			counter++;
			    			continue;
			    		}

			    		
			    	}

			    	System.out.println(counter);
			    	
			    }
}
