
public class IndexSum {
	
static int  sum_index(int i) {
		int a[]  = {2,1,2,1,2,1,2};
		int sum = 0,j=0;
		if(i<a.length) {
			while(j<=i) {
				sum = sum +a[j];
				j++;
			}
			return sum;
		}
		else {
			return sum;
		}
		
	}
	public static void main(String[] args) {
	 if(sum_index(0)!=0) {
		 System.out.println(sum_index(0));
	 }
	 else {
		 System.out.println("enter a index out of bound");
	 }

	}

}
