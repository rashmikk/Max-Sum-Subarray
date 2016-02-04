package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class maxSum {

	public static void main(String[] args) {
		int N = 0;
		String str = new String();
		Scanner stdin = new Scanner(System.in);
		N = Integer.parseInt(stdin.nextLine());
		str = stdin.nextLine();
		
		int result = sumMaxSubArray(N, str);
		stdin.close();
		System.out.println(result);
	}
	public static int sumMaxSubArray(int n, String s) {
		StringTokenizer str = new StringTokenizer(s);
		int size = str.countTokens();
		int[] tokens = new int[size];//tokens array
		int i = 0;
		while(str.hasMoreTokens()){
			tokens[i] = new Integer(str.nextToken()).intValue();
            i++;
		}
		int tempSum = 0;
		int sum = 0;
		for (int j=0; j<size-1; j++){
			if(!(tokens[j] == 0 || tokens[j+1] == 0)){
				if (j==0)
					sum = tokens[j]+tokens[j+1];
				else
					tempSum = tokens[j]+tokens[j+1];
				
				if (tempSum > sum){
					sum = tempSum;
				}
			} 
		}
		return sum;
	}

}
