/*

Find longest sorted substring from input string

input : abczgdpqrstubg
output : pqrstu

*/

import java.util.*;
public class twelth {

    public static void longestSubString(String st) {
        //reference array
        String master_s="abcdefghijklmnopqrstuvwxyz";
        //char[] master_a=master_s.toCharArray();

        //input array
        char[] input_a=st.toLowerCase().toCharArray();
        Arrays.sort(input_a);
        String input_s=new String(input_a);

        if(master_s.contains(input_s)) {
            System.out.println("Output is : "+ input_s);
            return;
        }

        int count=0;
        String output_s="";

        for(int i=0; i<input_a.length; i++) {
            for(int j=i; j<input_a.length; j++) {
                String pattern=input_s.substring(i, j+1);
                if(master_s.contains(pattern)) {
                    if(count<=pattern.length()) {
                        count=pattern.length();
                        output_s=pattern;
                    }
                }
            }
        }

        System.out.println("outout is : "+count+" : "+output_s);

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = s.nextLine();
        s.close();
        longestSubString(str);
    }
}
