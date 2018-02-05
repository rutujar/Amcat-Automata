package practice;

import java.util.Scanner;

public class Ques40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int k=n-i;k>0;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{	
				if(j==i)System.out.print(i);
				else System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
