package practice;

public class MaximumZeroS {
	public static void main(String[] args) {
		int a[][]= {
                {1,1,1,1},
                {1,1,0,0},
                {1,1,0,0},
                {1,1,1,0},
                };
		int currentmax=-1,index=-1;
		int count;
		for(int i=0;i<4;i++)
		{
			count=0;
			for(int j=0;j<4;j++)
			{
				if(a[i][j]==0) {
					if(4-count>currentmax) { currentmax=4-count;
					index=i;}
					break;
				}
				count++;
			}
		}
	
	System.out.println(index);
	}
	
}
