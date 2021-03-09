e/*
Ques1) count number of string appears in another string
Ex: input1: entertainment
Input2: en
Output:2
*/

import java.util.*;
public class third {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the main string : ");
        String input1=s.nextLine().toLowerCase();

        System.out.println("Enter mini string : ");
        String input2=s.nextLine().toLowerCase();
        s.close();

        countStringMatch(input1, input2);

    }

    public static void countStringMatch(String m, String n) {
        char[] a=m.toCharArray();
        char[] b=n.toCharArray();

        int s1=a.length;
        int s2=b.length;

        //System.out.println(s1 +" "+ s2);
        int count=0;
        for(int i=0; i<s1; i++) {
            int c=0;
            if(a[i]==b[0]) {
                for(int j=0; j<s2; j++) {
                    if(a[i]==b[j]) {
                        c++;
                        i++;
                    }
                }
                if(c==s2) {
                    count++;
                }
            }
        }

        System.out.println("Output is : " + count);
    }
}