package arrays;

public class AArrayAssignmentMethod3 {

	public static void main(String[] args) {
		int[][] arr = new int[2][8];
		arr[0] = new int[] {1,2,3,4,5,4,6,7};
		arr[1] = new int[] {8,7,6,4};
		

		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				
                    System.out.print(arr[i][j] + " ");
               
            }
            System.out.println();
				
		}


	}

}
