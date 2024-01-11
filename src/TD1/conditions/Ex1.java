package TD1.conditions;

import java.util.Scanner;



    public  class Ex1{
        public static void main(String[] args) {

            Scanner x = new Scanner(System.in);
            System.out.println("donner le premier nombre");
            int a=x.nextInt();
            System.out.println("donner le deuxieme nombre");
            int b=x.nextInt();
            System.out.println("donner le toisieme nombre");
            int c=x.nextInt();
            int max;
            if(a>b && a>c)
            {max=a;
                System.out.println("le maximun est "+max);}
            else if(b>a && b>c)
            {max=b;
                System.out.println("le maximun est "+max);}
            else
            {max=c;
                System.out.println("le maximun est "+max);}
        }
    }

