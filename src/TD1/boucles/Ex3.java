package TD1.boucles;

import java.util.Scanner;

    public class Ex3 {
        public static void main(String[] args) {
            Scanner a= new Scanner(System.in);
            int max=0;
            int c=0;
            System.out.println("donner 20 nombres :");
            for(int i =0;i<20;i++)
            {
                System.out.println("donner le nombre ");
                int N=a.nextInt();
                if (i==0) {
                    max=N;
                    c=N;
                }

                if (N>max)
                {max=N;
                    c=i;
                }
                if(i==19)
                {N=0;}
            }
            System.out.println("maximun est : "+max+" sa position est "+c);

        }
    }

