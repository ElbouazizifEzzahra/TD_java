package TD1.conditions;

import java.util.Scanner;


    public class Ex5 {



        public static void main(String[] args) {
            Scanner y = new Scanner(System.in);
            String a;
            System.out.println(" choisi la langue");
            a = y.nextLine();
            System.out.println("donner l'heure ");
            int h=y.nextInt();
            if(a=="f")
            {if ( h<18 || h>0)
                System.out.println("Bonjour ");
            else if(  h>18 ||h<22)
                System.out.println("bonsoir");
            else
                System.out.println("bonne nuit");}
            else if(a=="l")
            {if ( h<18 || h>0)
                System.out.println("GOOD MORNING ");
            else if(  h>18 ||h<22)
                System.out.println("GOOD EVENING");
            else
                System.out.println("GOOD NIGHT");}
        }}

