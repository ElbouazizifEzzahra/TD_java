package TD1.boucles;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("donner le nombre N:");
        int N=a.nextInt();
        int s=0;
        for(int i=0;i<N;i++){
            if(i%2!=0)
                s+=i;
        }
        System.out.println(" la somme des entiers impairs \r\n" + //
                "inférieurs à N est : "+s);
    }}