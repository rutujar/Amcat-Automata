package practice;

import java.util.Scanner;

public class Ques31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner io=new Scanner(System.in);
int n=io.nextInt();
int count=0,k=0;
	
for(int i=1;i<=n;i++) 
	{
		if(i%2==0)
		{
			count=count+i;
			k=count;	
			count++;
		}
		else
		{
			count=k;
		}
		for(int j=1;j<=i;j++)
		{
			if(i%2==0)
			{
				if(i==j)				System.out.print(--count); 
				else 					System.out.print(--count + "*");	
			}
			
			else
			{
				if(i==j)				System.out.print(++count);
				else					System.out.print(++count+"*");	
							
			}
		}
		System.out.println();
	
	}	
	

}
}
