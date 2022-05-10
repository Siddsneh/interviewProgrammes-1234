package Tutorial1;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//accept the value from user at runtime
		System.out.println("enter a number:"); //user know whether he enter the value or not
		int num=sc.nextInt(); //accept the value from user and store in num.//1234
		
		//1.by using algorithm
		int revnum=0;
		while(num!=0) {
			revnum=revnum*10 + num%10;//4 
			num=num/10;//123  12 1 0
		}
		
		System.out.println("reverse number is:"+revnum);
		

		//StringBuilder bl=new StringBuilder();
		//bl.append(num);
	//	StringBuilder revNum=bl.reverse();
		//System.out.println("reverse number is:"+revNum);
		
	}

	
	
}
