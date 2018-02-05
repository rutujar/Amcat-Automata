package practice;

import java.util.Scanner;

public class Ques1 {
public static void main(String[] args) {
	Scanner io=new Scanner(System.in);
	
	int[] cells=new int[]{1,1,1,0,1,1,1,1};
	int days=2;
	int[] cells1=new int[8];
cells1= cellscompete(cells,days);
for(int i=0;i<8;i++)
System.out.println(cells1[i]);
}

private static int[] cellscompete(int[] cells, int days) {
	// TODO Auto-generated method stub
	if(days==0)
		return cells;
	int[] temp=new int[8];
	
			
	for(int i=0;i<8;i++)
	{
		if(i==0) {
			if(cells[1]==0) temp[i]=0;
			else			temp[i]=1;
		}
		else if(i==7) {
			if(cells[6]==0) temp[i]=0;
			else			temp[i]=1;
		}
		else
		{
			if(cells[i-1]==cells[i+1])	temp[i]=0;
			else						temp[i]=1;
			
		}

		
		
		
	}
return cellscompete(temp,--days);	
}


}
