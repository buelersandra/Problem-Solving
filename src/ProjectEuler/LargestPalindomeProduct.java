package ProjectEuler;

public class LargestPalindomeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 100;
		int max = 1000;
		
		int iresult = 0;
		int jresult = 0;
		
		int maxResult =0;
		
		for(int i =max;i>=min;i--) {
			for(int j=i-1;j>=min;j--) {
				if(i*j== reverseNumber(i*j)) {
					iresult = i;
					jresult = j;
					max=Math.max(max, i*j);
					//System.out.println(String.format("i is %d ; j is %d ; result is %d ", i,j,i*j));
				}
			}
		}
		//System.out.println(String.format("i is %d ; j is %d", iresult,jresult));
		System.out.println(max);

	}
	
	
	public static int reverseNumber(int num) {
		int reverseNumber=0;
		
		while(num!=0) {
			int i = num%10; // get the number in the ones column
			//System.out.print(i+",");
			reverseNumber = reverseNumber*10+i;
			num = num/10; // to truncate number in the ones column and reassign
		}
		
		
		
		return reverseNumber;
		
		
	}

}
