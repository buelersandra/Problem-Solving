package HackerRank;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class ArrayProblems {

	public static void main(String[] args) {
		
		List<List<Integer>> sList = new ArrayList<>();
		List<Integer> sQ = new ArrayList<>();
		sQ.add(1);
		sQ.add(345255357);
		sQ.add(205970905);
		sList.add(sQ);
		sQ = new ArrayList<>();
		sQ.add(1);
		sQ.add(980306253);
		sQ.add(305632965);
		sList.add(sQ);
		sQ = new ArrayList<>();
		sQ.add(2);
		sQ.add(736380701);
		sQ.add(402184046);
		sList.add(sQ);
//		sQ = new ArrayList<>();
//		sQ.add(2);
//		sQ.add(1);
//		sQ.add(0);
//		sList.add(sQ);
//		sQ = new ArrayList<>();
//		sQ.add(2);
//		sQ.add(1);
//		sQ.add(1);
//		sList.add(sQ);
		
		
		
		dynamicArray(2, sList);
		
		

	}
	
	
	
	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		ArrayList<ArrayList<Integer>> sList = new ArrayList<ArrayList<Integer>>();
		int x=0,y=0,lastAnswer=0,queryResult=0;
		ArrayList<Integer> sQ = new ArrayList<>();
		
		
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0;i<n;i++) {
			
			sList.add(new ArrayList<Integer>());
		}
		
		for(int q=0;q<queries.size();q++) {
			List<Integer> query = queries.get(q);
			x = query.get(1);
			queryResult = (x^lastAnswer)%n;
	
			sQ = sList.get(queryResult);
			y =  query.get(2);
			if(query.get(0)==1) {
				sQ.add(y);
				
			}else if(query.get(0)==2) {
				lastAnswer = sQ.get(y%sQ.size()) ;
				System.out.println(lastAnswer);
				result.add(lastAnswer);
			}
			
			
			
		}
		
		
		
	   return result;

	}
	
	static int hourglassSum(int[][] arr) {
		
//		int[][] arr =  {
//				{-9 ,-9, -9 , 1 ,1 ,1 },
//				{0 ,-9 , 0 , 4, 3, 2},
//				{-9, -9 ,-9 , 1, 2 ,3},
//				
//				{0 , 0 , 8 , 6, 6 ,0},
//				{0,  0 , 0, -2, 0 ,0},
//				{-9, -9 ,-9 , 1, 2 ,3}
//				};
//
//		
//		hourglassSum(arr);
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
