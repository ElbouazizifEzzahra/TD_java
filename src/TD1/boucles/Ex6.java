package TD1.boucles;

public class Ex6 {
    public static void main (String []args){


        int n=15;
        for(int a=1;a<=9;a++)
        {
            for(int b=1;b<=9;b++){
                for(int c=1;c<=9;c++){
                    if((a+b+c)==n)
                    { System.out.println(a+""+b+""+""+c);}
                }

            }
        }
    }
}

