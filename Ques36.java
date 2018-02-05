package practice;

import java.util.Scanner;

public class Ques36 {

	public static void main(String[] args) {
	Scanner io=new Scanner(System.in);
	int n=io.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		for(int k=1;k<=n-i;k++)
		System.out.print(" ");
		
		
		for(int j=1;j<=2*i-1;j++)
			System.out.print("*");
	
		System.out.println();
	}
	
}
}
