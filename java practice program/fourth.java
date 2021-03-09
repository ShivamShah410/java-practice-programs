/*
Java 2: Fun Count
Input array of string 
if there is 5 input 
barbie 
barbie
doll 
doll
bike

output
barbie=2
doll=2
bike=1
*/

import java.util.*;
public class fourth {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the size :");
        int size=s.nextInt();
        s.nextLine();

        String[] word=new String[size];
        System.out.println("Enter the words :");
        for(int i=0; i<size; i++) {
            word[i]=s.nextLine().toLowerCase();
        }
        s.close();
        Arrays.sort(word);

        System.out.println("Output is : ");
        for(int i=0; i<size; i++) {
            int count=1;
            for(int j=i+1; j<size; j++) {
                if(word[i].equals(word[j])) {
                    count++;
                    word[j]="*";
                }
            }

            if(word[i]!="*") {
                System.out.println(word[i] + "=" + count);
            }
        }
    }
}
