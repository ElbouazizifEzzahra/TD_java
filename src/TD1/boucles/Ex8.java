package TD1.boucles;
import java.util.Scanner;
public class Ex8 {


        public static void main(String[] args) {
            Scanner x=new Scanner (System.in);
            System.out.println("donner N");
            int N=x.nextInt();
            for(int i=0;i<=N;i++){

                {for(int j=0;j<=i;j++){

                    System.out.print("*");



                }
                    System.out.println(" ");}

            }
            for(int i=0;i<=N;i++){

                {for(int j=0;j<N-i;j++){

                    System.out.print("*");



                }
                    System.out.println(" ");}

            }

        }
    }


