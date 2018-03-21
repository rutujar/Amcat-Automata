package practice;

public class ContiguousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={-2, 3, 4, -1, -2, 1, 5, -3};
		int current_max=a[0];
		int max_so_far=a[0];
		for(int i=0;i<a.length;i++) {
			current_max=Math.max(a[i], current_max+a[i]);
			max_so_far=Math.max(max_so_far, current_max);
		}
		
		System.out.println(max_so_far);
	}

}
