package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Month_days = new int[4][7];
		int i, j, k = 1;
		
			for(i=0;i<4;i++) {
				for(j=0;j<7;j++) {
					Month_days[i][j] = k;
					k++;
				}
			}
			for(i=0;i<4;i++) {
				for(j=0;j<7;j++) {
					System.out.print(Month_days[i][j]+ " ");
				}
					System.out.println();
				
			}
		
	}

}
