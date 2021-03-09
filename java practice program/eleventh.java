import java.util.Arrays;
import java.util.Scanner;

/*
Take an array input, print the product of maximum and minimum element
*/

class eleventh {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size : ");
        int size=s.nextInt();
        int[] a=new int[size];
        System.out.println("Enter elements : ");
        for(int i=0; i<size; i++){
            a[i]=s.nextInt();
        }
        s.close();
        Arrays.sort(a);
        double ans=a[0]*a[size-1];
        System.out.println("Output is : " + ans);
    }
}