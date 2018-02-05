package practice;

import java.util.Scanner;

public class Ques27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner io=new Scanner(System.in);
		int n1=io.nextInt();
		int n2=io.nextInt();
		for(int i=n1+1; i<n2; i++)
		  {
		      int temp=i;
		      int num=0;
		      while(temp!=0)
		      {
		          int rem=(temp%10);
		          num+=rem*rem*rem;
		          temp=temp/10;
		      }
		      if(i==num)
		      {
		          System.out.print(i+" ");
		      }
		  }
	}

}
