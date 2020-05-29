public class MaxOfThree {

    public static void main(String[ ] args) {
        int res = max(7, 42, 53);
        System.out.println(res);
    }

    static int max(int a, int b, int c) {
       int  max=0;
    	if(a > b) {
          
          
        }
        else if(b > a){
            if(b > c) {
            	max = b;
            }
            
        }
        else max =  c;
    	return max;
    }

}

