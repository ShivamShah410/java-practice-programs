import java.util.*;
public class eighth {
    public static void calculatePatternSum(int a1[], int a2[], int size) {
        int[] ans = new int[size];
        
        int sum=0;
        System.out.println("Output is : ");
        for(int i=0; i<size; i++) {
            if(a1[i]%2==0 && a2[i]%2==0) {
                ans[i]=a1[i]+a2[i];
            }
            else  {
                ans[i]=0;
            }
            sum=sum+ans[i];
        }
        if(sum==0) {
            System.out.println("No even Element!!");
            return;
        }
        for(int i : ans) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of arrays : ");
        int size=s.nextInt();
        if(size<1 || size>10) {
            System.out.println("Invalid input");
            s.close();
            return;
        }

        int[] a1=new int[size];
        int[] a2=new int[size];
        System.out.println("Enter 1st array elements : ");
        for(int i=0; i<size; i++) {
            a1[i]=s.nextInt();
        }
        System.out.println("Enter 2nd array elements : ");
        for(int i=0; i<size; i++) {
            a2[i]=s.nextInt();
        }
        s.close();
        calculatePatternSum(a1, a2, size);
    }
}
