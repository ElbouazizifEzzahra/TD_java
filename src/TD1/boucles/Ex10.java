package TD1.boucles;



    public class Ex10 {
        public static void main(String[] args) {

            int a,b,c,d;
            for(int i=100;i<999;i++)
            {
                a=i/100;
                b=i%100;
                c=b/10;
                d=b%10;
                if((a*a*a+c*c*c+d*d*d)==i)
                {System.out.println(i);}
            }
        }}

