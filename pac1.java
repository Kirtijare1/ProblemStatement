package Assignment;

public class pac2 {
public static void main(String[] args) {
		
		int arr[] = {-40,-5,1,3,6,7,8,20};
		int n = 15;
		int sum = 0;
		
		for(int i = 0 ; i< arr.length; i++) {
			for(int j = 0 ; j < i ; j++) {
				sum = arr[i] + arr[j];
				if(sum == n) {
					System.out.println("Pair of element whose sum is equal to 15 : " +  arr[i] + " " + arr[j] + " " );
				}
			}
			
		}
	}

}


