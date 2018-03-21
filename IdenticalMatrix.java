package practice;

public class IdenticalMatrix {
public static void main(String[] args) {
	
	int a[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
	
	int b[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};

	if(isSame(a,b))
		System.out.println("Both are same");
	else
		System.out.println("Not same");
}

 static boolean isSame(int [][]a,int [][]b) {
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(a[i][j]!=b[i][j])
				return false;
		}
	}
 return true;
 }
}
