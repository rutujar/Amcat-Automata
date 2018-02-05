package practice;

import java.util.Scanner;

public class Ques32 {
public static void main(String[] args) {
	Scanner io=new Scanner(System.in);
	
	int n=io.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
			System.out.print(i);
	System.out.println();
	}
	for(int i=n-1;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
			System.out.print(i);
	System.out.println();
	}
}
}
