package practice;

public class PythagoreanTriplet {
	public static void main(String[] args) {
	    // triplet:  a^2 + b^2 = c^2
int limit =20;
int a,b,c=0,m=2;

while(c<limit)
{
	for(int n=1;n<m;n++)
	{
		a=m*m-n*n;
		b=2*m*n;
		c=m*m+n*n;
		
		if(c>limit) break;
	System.out.println(a+" "+b+" "+c);
	}
	m++;
}

	}
}
