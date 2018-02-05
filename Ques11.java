package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques11 {
	
	public static void main(String[] args) {
	
	
		Scanner io= new Scanner(System.in);
		String s=io.nextLine();
	
		String result=omitvowel(s,s.length());
		System.out.println(result);
	}	
	private static String omitvowel(String s, int length) {
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		ArrayList<Character> list= new ArrayList<Character>();
		
		for(int i=0;i<length;i++)
		{
			if(c[i]!='a'&& c[i]!='e'&& c[i]!='i'&& c[i]!='o'&& c[i]!='u')
				list.add(c[i]);
					
		}
		
		String result="";
		for(char x:list)
			result+=x;
		
		return result;
	}
		
		
	

}
