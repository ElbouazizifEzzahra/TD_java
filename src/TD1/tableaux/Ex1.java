package TD1.tableaux;
import java.util.Scanner;
public class Ex1 {


        public static void main (String[] args){
            int N;

            Scanner scan=new Scanner(System.in);
            do{  System.out.println(" donnez la taille de votre tableau");
                N= scan.nextInt();}while(N<10||N>50);
            int[]tab=new int [N];

            for(int i=0;i<N;i++){
                System.out.println("donnez un element");
                tab[i]= scan.nextInt();
            }
            for(int i=0;i<N;i++){
                System.out.print(tab[i]+" | ");
            }
            int max,posmax;
            max=tab[0];
            posmax=0;
            for(int i=0;i<N;i++){
                if(tab[i]>max) {max=tab[i];
                    posmax=i;}}
            System.out.println("le max est "+max+ " et sa position est :"+posmax);


            int min,posmin;
            min=tab[0];
            posmin=0;
            for(int i=0;i<N;i++){
                if(tab[i]<min) {min=tab[i];
                    posmin=i;}}
            System.out.println("le min est "+min+ " et sa position est :"+posmin);




        }
}

