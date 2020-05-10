package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ArrayProblems {

	public static void main(String[] args) {
		differenceArray();
	}
	
	
	static void differenceArray() {
		int[] initial = {10,5,20,40};
		//difference array
		int[] diff = new int[initial.length+1];
		
		 int n = initial.length; 
		  
		 diff[0] = initial[0]; 
		 diff[n] = 0; 
	        for (int i = 1; i < n; i++) 
	        	diff[i] = initial[i] - initial[i - 1]; 
	        
	        
		diff[0] = diff[0]+10;
		diff[1]= diff[1+1]+10;
		
		for (int i=0;i<initial.length;i++) {
			if(i==0) {
				initial[0]=diff[0];
				
			}else {
				initial[i] = diff[i]-initial[i-1];
			}
			System.out.print(initial[i]+",");
		}
		
		System.out.println();
		
		//update 0,1,10  O(n*m)
		for(int min =0;min<=1;min++) {
			initial[0] = initial[0]+10;
		}
		
		for (int i : initial) {
			System.out.print(i);
		}
	}
	
	// Creates a diff array D[] for A[] and returns 
    // it after filling initial values. 
    static void initializeDiffArray(int A[], int D[]) 
    { 
          
        int n = A.length; 
  
        D[0] = A[0]; 
        D[n] = 0; 
        for (int i = 1; i < n; i++) 
            D[i] = A[i] - A[i - 1]; 
    } 
	
	//O(n+m) PREFIX - SUM ALGORITHM
	 static long arrayManipulation(int n, int[][] queries) {
		 
//		 int[][] queries = {
//					{1 ,2, 100},
//					{2 ,5, 100},
//					{3 ,4, 100}};
//			
//			arrayManipulation(5, queries);

	        long[] set = new long[n+1];
	        int min=0,max = 0; 
	        long k=0,resultMax=0,x=0;

	        for(int i=0;i<queries.length;i++){
	            min = queries[i][0];
	            max = queries[i][1];
	            k = queries[i][2];

	            set[min] = set[min]+k;
	            if((max+1)<=n) 
	                set[max+1]-=k;  
	        }

	        for(int i=1;i<=n;i++)
	        {
	            x=x+set[i];
	           resultMax=Math.max(x, resultMax);

	        }


	        //O(n*m)
	        // for(int i=0;i<queries.length;i++){
	        //     min = queries[i][0]-1;
	        //     max = queries[i][1]-1;
	        //     k = queries[i][2];


	        //     resultMin = min;
	        //     resultMax = max;
	            
	        //     for(int j=min;j<=max;j++){
	        //         set[j] = set[j]+k;
	        //         //System.out.print(set[j]+",");
	        //         resultMax = Math.max(resultMax,set[j]);
	        //     }
	        //     //System.out.println();
	        // }
	        System.out.println(resultMax);
	        return resultMax;

	    }
	
	
	static int[] matchingStrings(String[] strings, String[] queries) {
	
		
		int[] result = new int[queries.length];
		HashMap<String, Integer> map = new LinkedHashMap<>();
		
		
		for(int i=0;i<queries.length;i++) {
			map.put(queries[i], 0);
		}
		
		
		for(int i =0;i<strings.length;i++) {
			if(map.containsKey(strings[i])) {
				map.put(strings[i], map.get(strings[i])+1); 
			}

		}
		int count = 0;
		for (int i : map.values()) {
			result[count]=i;
			System.out.println(i);
			count++;
		}
		
		System.out.println(Arrays.toString(result) );
		return result;


    }

	
	static void rotateArr(int[] arr,int count) {
//		int[] num = {1,2,3,4,5};
//		rotateArr(num, 4);
		int[] list = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				
				list[(i-count+arr.length)%arr.length]=arr[i];
				
			}	
			for (int i : list) {
				System.out.print(i+" ");
			}
			System.out.println();
		
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
