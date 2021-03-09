/*
2. Take input string of words. 
If the first letter of each word is same then 
reverse the last word and concatenate that with first word else 
reverse the first word and concatenate it with last word.
*/

import java.util.*;
public class sixteenth {

    public static void doPatChech(String st) {
        String[] a=st.split(" ");
        char c=a[0].charAt(0);
        boolean b=false;
        for(int i=1; i<a.length;i++) {
            if(Character.toLowerCase(a[i].charAt(0))!=Character.toLowerCase(c)) {
                b=true;
                break;
            }
        }
        if(b==false) {
            String rev="";
            String temp=a[a.length-1];
            for(int i=temp.length()-1; i>=0; i--) {
                rev=rev+temp.charAt(i);
            }
            System.out.println(rev);
            System.out.println(rev + a[0]);
        }
        if(b==true) {
            String rev="";
            String temp=a[0];
            for(int i=temp.length()-1; i>=0; i--) {
                rev=rev+temp.charAt(i);
            }
            System.out.println(rev);
            System.out.println(rev + a[a.length-1]);
        }
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=s.nextLine();
        s.close();
        doPatChech(str);
    }
}
