/*
2. Two string arrays will be given. 
we have to print those words which are present in 1st array but not in 2nd
*/

import java.util.*;
public class sixth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of 1st array : ");
        int s1=s.nextInt();
        System.out.println("Enter size of 2nd array : ");
        int s2=s.nextInt();
        s.nextLine();

        if(s1<=0 || s2<=0 || s1>5 || s2>5 || s1<s2) {
            System.out.println("Invalid");
            s.close();
            return;
        }

        String[] arr1=new String[s1];
        String[] arr2=new String[s2];

        System.out.println("Enter elements of first array : "); 
        for(int i=0; i<s1; i++) {
            arr1[i]=s.nextLine();
        }
        System.out.println("Enter elements of second array : "); 
        for(int i=0; i<s2; i++) {
            arr2[i]=s.nextLine();
        }
        s.close();

        System.out.println("Output is : ");
        for(int i=0; i<s1; i++) {
            boolean f=false;
            for(int j=0; j<s2; j++) {
                if(arr1[i].equalsIgnoreCase(arr2[j])) {
                    f=true;
                }
            }
            if(f==false) {
                System.out.println(arr1[i]);
            }
        }
    }
}
