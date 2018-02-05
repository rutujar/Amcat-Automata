package practice;

import java.util.Scanner;

public class Ques35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner io= new Scanner(System.in);
		int n=io.nextInt();
		int a=1;
		int b=n*n+1;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>i;j--)
				System.out.print(" ");
			
			//System.out.println("A");
			for(int k=1;k<=i;k++)
			{
				System.out.print(a++ +"*");
			}
			
			for(int l=1;l<=i;l++)
			{
				if(l!=i)System.out.print(b++ +"*");
				else System.out.print(b++);
			}
				
				b=b-2*(i-1);
			System.out.println();
		}
		 
		 
	}

}
