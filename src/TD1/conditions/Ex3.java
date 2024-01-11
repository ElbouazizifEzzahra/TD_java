package TD1.conditions;

import java.util.Scanner;

    public class Ex3 {
        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            System.out.println("donner le premier nombre");
            int a=x.nextInt();
            System.out.println("donner le deuxieme nombre ");
            int b=x.nextInt();
            int somme =a+b;
            if(somme%2==0)
                System.out.println(" la somme est paire ");
            else
                System.out.println(" la somme est impaire ");
            int produit=a*b;
            if(produit%2==0)
                System.out.println(" le produit est paire ");
            else
                System.out.println(" le produit est impaire ");
            System.out.println("le signe de a et b dans le produit  ");
            if (a>0 && b>0 || a<0 && b<0)
                System.out.println("  est positif");
            else
                System.out.println("est negative");
            System.out.println("le signe de a et b dans le la somme  ");
            if (a>0 && b>0 || a>b && a>0)
                System.out.println("est positif");
            else
                System.out.println("est negatif");

        }
}
