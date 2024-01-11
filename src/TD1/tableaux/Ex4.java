package TD1.tableaux;
import java.util.Scanner;
public class Ex4 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[][] Mat = new int[3][3];
            int[][] Mat2 = new int[3][3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Mat[i][j] = scan.nextInt();
                }
            }


            System.out.println("Matrice 1");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(Mat[i][j]+" ");
                }
                System.out.println();
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Mat2[i][j] = scan.nextInt();
                }
            }

            System.out.println("Matrice 2");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(Mat2[i][j]+" ");


                }
                System.out.println();
            }

            int[][] Matsomme = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Matsomme[i][j]=Mat[i][j]+Mat2[i][j];
                }
            }

            System.out.println("Matricesomme");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(Matsomme[i][j]+ " ");


                }
                System.out.println();
            }


        }
    }