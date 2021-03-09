/*
hello world program
LCM and GCD of two numbers
*/


import java.util.*;
class first{
    public static int lcm(int n, int m){
        //int lcm = (n*m)/gcd(n,m);
        //return lcm;

        //alternate method for gcd

        int lcm = n>m?n:m;
        while(true){
            if(lcm%n==0 && lcm%m==0){
                break;
            }
            lcm++;
        }
        return lcm;
    }

    public static int gcd(int n, int m){
        //int gcd = (n*m)/lcm(n,m);
        //return gcd;

        //alternate method for gcd
        if(n==0)
            return m;
        if(m==0)
            return n;
        if(m==n)
            return m;
        if(n>m)
            return gcd(n-m, m);
        return gcd(n, m-n);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!!\n" + "Enter two number to find gcd & lcm : ");
        Scanner s = new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println("LCM is : "+ lcm(n1, n2));
        System.out.println("GCD is : "+ gcd(n1, n2));
        float answer=4;
        System.out.printf("%.2f",answer);
        s.close();
    }
}
