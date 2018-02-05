package practice;

import java.util.Scanner;
import java.util.Stack;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner io=new Scanner(System.in);
		String s=io.nextLine();
		
		int result=match(s.toCharArray(),s.length());
		System.out.println(result);
	}

	 static int match(char[] s, int length) {
		// TODO Auto-generated method stub
	int count=0;
	boolean flag=true;
	Stack<Character> stack=new Stack<Character>();
	for(int i=0;i<length;i++)
	{
		if(s[i]=='(' || s[i]=='[' || s[i]=='{')
		{
		   stack.push(s[i]);
		   count++;
		   continue;
		}
		
		else	if(s[i]=='}' && stack.peek()=='{')
		{
			stack.pop();
		}
		
		else	if(s[i]==')' && stack.peek()=='(')
		{
			stack.pop();
		}
		else	if(s[i]==']' && stack.peek()=='[')
		{
			stack.pop();
		}
						
		else
			flag=false;
		
	}
		 
		 if(flag && stack.empty()) return count;
		 else return -1;
	}

}
