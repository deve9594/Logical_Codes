import java.util.Scanner;

public class BinaryConvert {

	public static void main(String[] args) {
		int num,i=-1;
        int arr[] = new int[50];
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        while(num>0){
            arr[++i] = num%2;
            num = num/2;
            
        }
        while(i>=0){
            System.out.print(arr[i]+" ");    
            i--;
        }
	}

}
