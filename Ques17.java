package practice;

import java.util.Scanner;

public class Ques17 {

	public static void main(String[] args) {
	Scanner io=new Scanner(System.in);
	
	int n=io.nextInt();
	int s=io.nextInt();
	
	for(int i=1;i<n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(s);
		}
		s++;
		System.out.println();
	}
	s--;
	
	for(int i=n-1;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(s);
		}
		s--;
		System.out.println();
	}
}
}
