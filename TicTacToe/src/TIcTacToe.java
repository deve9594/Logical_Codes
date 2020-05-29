import java.util.Scanner;

public class TIcTacToe {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9},{7,5,3},{1,5,9},{3,6,9},{1,4,7},{2,5,8}};
		int user1[] = new int[5];
		int user2[] = new int[5];
		boolean present = false;
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int value=0;
		int u1 = 0;
		int u2 = 0;
		int count1=0,count2=0;
		int value1 = 0;
		int finalcount1=0,finalcount2=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(++value+" ");
			}
			System.out.println();
		}
		for(int i=0;i<9;i++) {
			if(i%2==0) {
				System.out.println("User 1 turn");
			}
			else {
				System.out.println("User 2 turn");
			}
			input  = sc.nextInt();
			outer: for(int k=0;k<user1.length;k++) {
				if(user1[k]==input || user2[k]==input || input>9 || input<1) {
					present = true;
					
				}
				else {
					present = false;
				}
				if(present==true) {
					System.out.println("The Number is already present  or greater than 9 or less than 1 please renter!!!!!!!!");
					if(i%2==0) {
						System.out.println("User 1 again enter a number");
					}
					else {
						System.out.println("User 2 again enter a number");
					}
					input  = sc.nextInt();
					continue outer;
				}
			}
			if(i%2==0) {
			
				user1[u1] = input;
				u1++;
				
			}
			else {
				
				user2[u2] = input;
				u2++;
				
			}
			for(int f=0;f<3;f++) {
				for(int g=0;g<3;g++) {
					++value1;
					for(int c=0;c<user1.length;c++) {
						if(value1==user1[c]) {
							count1++;
							break;
						}
						else{
							count1=0;
						}
					}
					for(int c=0;c<user2.length;c++) {
						if(value1==user2[c]) {
							count2++;
							break;
						}
						else{
							count2=0;
						}
					}
					if(count1>0) {
						System.out.print(" O ");
					}
					else if(count2>0) {
						System.out.print(" X ");
					}
					else {
						System.out.print(" "+value1+" ");
					}
					count1=0;
					count2=0;
				}
				System.out.println();
			}
			value1=0;
			if(i>=4) {
			    for(int w=0;w<a.length;w++) {
			    	for(int x=0;x<3;x++) {
			    		for(int y=0;y<user1.length;y++) {
			    			if(a[w][x]==user1[y]) {
			    				finalcount1++;
			    			}
			    			else if(a[w][x]==user2[y]) {
			    				finalcount2++;
			    			}
			    		}
			    	}
			    	if(finalcount1==3) {
			    		System.out.println("user1 won");
			    		System.exit(0);
			    	}
			    	else if(finalcount2==3) {
			    		System.out.println("user2 won");
			    		System.exit(0);
			    	}
			    	finalcount1=0;
			    	finalcount2=0;
			    }
			}
			
		//System.out.println("i is "+i);
		}
		
		System.out.println("Match is drawn");
		
	}

}
