package TD1.boucles;


import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int N,f=1;

        do{
            System.out.println("donner un nombre positif pour calculer le factoriel");
            N=t.nextInt();
        }while(N<0);

        for(int i =1;i<=N ;i++)
        {
            f=f*i;

        }
        System.out.println("le factoriel de "+ N +" est: "+f);

    }
}