package TD1.conditions;

import java.util.Scanner;
import java.lang.Math;
    public class Ex2{
        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            System.out.println("donner le premier coff");
            int a=x.nextInt();
            System.out.println("donner le deuxieme coff");
            int b=x.nextInt();
            System.out.println("donner le toisieme coff");
            int c=x.nextInt();
            double X,x1,x2;
            double delta=b*b-(4*a*c);
            if(a==0 && b==0)
                System.out.println("Tout X est une solution");
            else if(a==0 && b!=0)
            {X=-c/b;
                System.out.println("la solution est x=" +X);}
            else if(a!=0 )
            { if(delta>0)
            { x1=(-b-Math.sqrt(delta)/2*a);
                x2=(-b+Math.sqrt(delta)/2*a);
                System.out.println("equation accepte deux racine  x1=" +x1+" x2= "+x2);
            }
            else if (delta==0)
            {X=-b/(2*a);
                System.out.println("l'equation a une seul racine double x= " + X);}
            else
                System.out.println("equation pas de solution dans R mais  a  des solutions complexes");
            }

        }


    }

