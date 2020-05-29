import java.util.Scanner;

public class BinarySearch {

	void bubblesort(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	int BinarySearc(int arr[],int n,int data) {
		int l=0,r=n-1,mid;
		while(l<=r) {
			mid = (l+r)/2;
			System.out.println(l+" "+mid+" "+r);
			if(data==arr[mid]) {
				return mid;
			}
			else if(arr[mid]<data) {
				l = mid +1;
			}
			else {
				r = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {15,1,32,10,90,80,63,11,45};
		int len = arr.length;
		int data,index;
		BinarySearch bs = new BinarySearch();
		System.out.println("Enter a data to search");
		data  = sc.nextInt();
		bs.bubblesort(arr);
		index = bs.BinarySearc(arr, len, data);
		if(index==-1) {
			System.out.println("Not found");
		}
		else {
			System.out.println("Data Found At : "+index);
		}
				
	}

}
