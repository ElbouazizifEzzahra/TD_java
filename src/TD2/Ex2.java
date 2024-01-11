package TD2;
import java.lang.Math;
public class Ex2 {


    public static void main(String[] args) {

        Point z1 = new Point();
        z1.setX(5);
        z1.setY(2);
        z1.setAbsice('a');

    }
}


        class Point {
            private char absice;
            private int x;
            private int y;
            public Point(){};
            public Point(char absice,int x,int y){
                this.absice=absice;
                this.x=x;
                this.y=y;

            }
            public void setX(int x)
            {
                this.x=x;
            }
            public void setY(int y)
            {
                this.y=y;
            }
            public void setAbsice(char absice)
            {
                this.absice=absice;
            }
            public int getX()
            {return x;}
            public int getY()
            {return y;}
            public int getAbsice(){
            return absice;}
            public double norme(){
                return Math.sqrt(x*x+y*y);
            }
        }



