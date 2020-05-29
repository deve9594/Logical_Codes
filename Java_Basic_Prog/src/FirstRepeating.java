
public class FirstRepeating {

	public static void main(String[] args) {
		String s = "ivendra is my name";
		int count=0,i=0,j=0;
		s = s.toLowerCase();
		char[] c = s.toCharArray();
		for(i=0;i<c.length;i++) {
			for(j=i+1;j<c.length;j++) {
				if(c[i]==c[j] && c[i]!=' ') {
					//count++;
					System.out.println(c[i]);
					System.exit(0);
				}
			}
		}
		System.out.println("No repeated");
		
	}

}
