package HackerRank;

public class ArrayProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr =  {
				{-9 ,-9, -9 , 1 ,1 ,1 },
				{0 ,-9 , 0 , 4, 3, 2},
				{-9, -9 ,-9 , 1, 2 ,3},
				
				{0 , 0 , 8 , 6, 6 ,0},
				{0,  0 , 0, -2, 0 ,0},
				{-9, -9 ,-9 , 1, 2 ,3}
				};

		
		hourglassSum(arr);

	}
	
	static int hourglassSum(int[][] arr) {
		int max = 0;
		int sum = 0;
		int column = 0;
		
		int columnSize = arr[0].length; //number of columns is each row length; size of array row length
		System.out.print(columnSize);
		
		for(int row=0;row<arr.length;row++) {
			for(int c =0;c<columnSize;c++) {
				if(row+3<=arr.length && c+3 <=columnSize) {
					sum=0;
					for(int i=row;i<row+3;i++) {
						column = c;
						while(column<c+3) {
								if(row+1==i ) {
									sum +=arr[i][column+1];
									
									//System.out.print(String.format("middle  %d %d value %d &&",i,column, arr[i][column]) );
									break; // exit from while loop
									
								}else if(row+1!=i){
									sum +=arr[i][column];
									//System.out.print(String.format("  %d %d value %d &&",i,column, arr[i][column]) );
									column++;
								}
								
								
							}
							
						}
				}else {
					break;
				}
			max = Math.max(max, sum);
			
			}
		}
		
        return max;


    }
	
	
	
	
	
	static int[] reverseArray(int[] a) {
        int size = a.length-1;
        int[] result = new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            result[size-i]=a[i];
        }

        return result;


    }
	
	
	

}
