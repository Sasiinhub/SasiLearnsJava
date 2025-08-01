package arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Month_days = new int[12];
		int i, j, k = 0;
		
		for(i = 0; i<12; i++) {
				Month_days[i] = k;
						k++;
		}
		for(i = 0; i<12; i++) {
			System.out.println(Month_days[i]);
		}
	}

}
