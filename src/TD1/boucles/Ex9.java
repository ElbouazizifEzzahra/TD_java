package TD1.boucles;

import java.util.Scanner;

    public class Ex9 {
        public static void main(String[] args) {

            int R1,Q1,Q2,R2;
            Scanner n=new Scanner(System.in);
            System.out.println("donner un nombre ");
            int x=n.nextInt();

            if(x/1000 <1)
            { if(x/100 <1)
            {
                if(x/10<1)
                    System.out.println(x);
                else
                {R1= x/100;
                    Q1=x%100;
                    R2=Q1/10;
                    Q2=Q1%10;
                    System.out.println(R1 +"+"+R2+"+"+Q2+"="+(R1+R2+Q2));}
            }

            }

        }
    }



