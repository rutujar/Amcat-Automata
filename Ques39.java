package practice;

import java.util.Scanner;

public class Ques39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int count =1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==i)System.out.print(count++);
				else
				System.out.print(count++ + "*");
			}
			System.out.println();
		}
		count =count-n;
		for(int i=n;i>=1;i--)
		{
			int k=count;
			
			for(int j=1;j<=i;j++)
			{
				if(j==i)System.out.print(count++);
				else
				System.out.print(count ++ + "*");
			}
			count=k-i+1;
			System.out.println();
		}
	}

}
