package TD1.conditions;

import java.util.Scanner;
public class Ex6 {


    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int a =y.nextInt();
        int b =y.nextInt();
        if (a>0 && b>0 || a<0 && b<0)
            System.out.println("  le produit est positif");
        else
            System.out.println(" le produit est negative");
    }
}
