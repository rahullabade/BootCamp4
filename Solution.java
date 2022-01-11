package company;

import java.util.Scanner;

public class Solution {
	/*
	 * public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in);
	 * 
	 * System.out.print("Enter a number: "); int number = scanner.nextInt(); while
	 * (number > 0) { if (number % 2 == 0) { number = number / 2; } else { number =
	 * number - 1; } } }
	 */
	int numberOfSteps(int num) {
		        int count=0;
		        while(num>0){
		            if(num %2==0) {
		                num= num/2;
		                count++;}
		            else {
		                num = num-1;
		                count++;
		        }
		        
		    }
		        return count;
}
}