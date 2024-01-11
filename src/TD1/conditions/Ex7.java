package TD1.conditions;


import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);


        System.out.println("enter un nombre de trois chiffres");
        int e=y.nextInt();
        if((e/100) >10 || (e/100)==10 || (e/100<1))
        {do{
            System.out.println("enter un nombre de trois chiffres");
            e=y.nextInt();
        }while((e/100) >10|| (e/100)==10   || (e/100<1)) ;
        }

        int Q1=e/100;
        int R1=e%100;
        int Q2=R1/10;
        int R2=R1%10;
        System.out.println(Q2%10);
        System.out.println("les nombres sont "+Q1+Q2+R2+" " +Q2+R2+Q1+" "+Q2+Q1+R2+" "+R2+Q1+Q2+" "+Q1+R2+Q2+" "+R2+Q2+Q1);


    }}
