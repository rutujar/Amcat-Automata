package practice;

import java.util.Scanner;

public class Ques34 {
	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if((i%2==0 && j==1)||(i%2!=0 && j==7)) System.out.print(i+1);
				
				
				else System.out.print(i);
			}
			
			System.out.println();
		}
		
	}
}
