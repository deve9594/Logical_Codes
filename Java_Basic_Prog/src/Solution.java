import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a[] = s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                System.out.print(a[i]);
            }
        }
        System.out.print("  ");
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                System.out.print(a[i]);
            }
        }
    }
}