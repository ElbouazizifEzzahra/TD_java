package TD1.conditions;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("donner la moyenne ");
        int b=x.nextInt();
        int i=0;
        if (b==16 || b>16)  i=1;

        else if (b==14 || b>14)  i=2;
        else if (b==12 || b>12)  i=3;
        else if (b==10 || b>10)  i=4;

        switch (i) {
            case 1:
                System.out.println("tes bien");
                break;
            case 2:
                System.out.println(" bien");
                break;
            case 3:
                System.out.println("a bien");
                break;
            case 4:
                System.out.println("passable");
                break;

            default:
                System.out.println("Ratt");
                break;
        }
    }
}
