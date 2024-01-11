package TD1.conditions;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        int A;

        System.out.println("enter un mois");
        int m=w.nextInt();
        switch (m) {
            case 1:
                System.out.println("31j");
                break;
            case 2:
            {do {System.out.println("donner lannee ente 1900et 2100");
                A =w.nextInt();}while(A>2100 || A<1900);
                if(A%4==0)
                    System.out.println("29j");
                else
                    System.out.println("28j");

            }
            break;
            case 3:
                System.out.println("31j");
                break;
            case 4:
                System.out.println("30j");
                break;
            case 5:
                System.out.println("31j");
                break;
            case 6:
                System.out.println("30j");
                break;
            case 7:
                System.out.println("31j");
                break;
            case 8:
                System.out.println("31j");
                break;
            case 9:
                System.out.println("30j");
                break;
            case 10:
                System.out.println("31j");
                break;
            case 11:
                System.out.println("30j");
                break;
            default:
                System.out.println("31j");
                break;
        }
    }
}