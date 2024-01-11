package TD1.conditions;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("donner le premier varianle");
        int a=w.nextInt();
        System.out.println("donner le deuxieme varianle");
        int b= w.nextInt();
        if(a>b)
            System.out.println(b+" "+a);
        else
            System.out.println(a+" "+b)  ;
    }
}
