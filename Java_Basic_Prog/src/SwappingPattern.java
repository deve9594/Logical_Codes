
public class SwappingPattern {

	public static void main(String[] args) {
		String s = "ABCDEFG";
		char a [] = s.toCharArray();
		int len = a.length;
		System.out.println(len);
		for(int i=0;i<a.length;i++) {
			char start = a[0];
			for(int j=0;j<a.length;j++) {
				
				if(j<len-1 && i>0) {
					a[j] = a[j+1];
					System.out.print(a[j]);
					
				}
				else if(j==len-1 && i>0) {
					a[j] = start;
					System.out.print(a[j]);
				}
				else {
					System.out.print(a[j]);
				}
				
			}
			
			System.out.println();
		}
		
				
	}

}

/*
ABCDE
BCDEA
CDEAB
DEABC
EABCD

*/