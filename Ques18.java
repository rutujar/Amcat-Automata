package practice;

import java.util.Scanner;

public class Ques18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner io=new Scanner(System.in);
		int num1=io.nextInt();
		int num2=io.nextInt();
		
		System.out.println(isOccured(num1,num2));
	}

	private static int isOccured(int num1, int num2) {
		// TODO Auto-generated method stub
		int count=0;
		
		while(num1>0)
		{
			if(num2==num1%10) count++;
			num1=num1/10;
		}
		
		
		
		
		
		return count;
	}

}
