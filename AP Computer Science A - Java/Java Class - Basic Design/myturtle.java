import TurtleGraphics.*;
import java.util.Random;
import java.awt.*;

class myturtle{

    public static void main(String[] args){
        int c= 150,y;
        Turtle bob = new Turtle();
        Random rand=new Random();
        bob.moveto(0,0);

        for (int x=0;x<50;x++){
            y=x;
            if (c>175)y=-x;
            bob.setcolor(c+y,0,0);
            bob.polygon(4,150+x);
        }
        bob.left(90);
        for (int x=0;x<50;x++){
            y=x;
            if (c>175)y=-x;
            bob.setcolor(0,c+y,0);
            bob.polygon(4,150+x);
        }
        bob.left(90);
        for (int x=0;x<50;x++){
            y=x;
            if (c>175)y=-x;
            bob.setcolor(0,0,c+y);
            bob.polygon(4,150+x);
        }
        bob.left(90);
        for (int x=0;x<50;x++){
            y=x;
            if (c>175)y=-x;
            bob.setcolor(255,c+y,0);
            bob.polygon(4,150+x);
        }

        for (int i=0;i<9;i++){

            for (int x=0;x<50;x++){
                y=x;
                if (c>175)y=-x;
                bob.setcolor(c+y,0,0);
                bob.polygon(4,50+x);
            }
            bob.left(90);
            for (int x=0;x<50;x++){
                y=x;
                if (c>175)y=-x;
                bob.setcolor(0,c+y,0);
                bob.polygon(4,50+x);
            }
            bob.left(90);
            for (int x=0;x<50;x++){
                y=x;
                if (c>175)y=-x;
                bob.setcolor(0,0,c+y);
                bob.polygon(4,50+x);
            }
            bob.left(90);
            for (int x=0;x<50;x++){
                y=x;
                if (c>175)y=-x;
                bob.setcolor(255,c+y,0);
                bob.polygon(4,50+x);
            }
           bob.left(40);

        }
        // bob.moveto(0,10);
        //bob.polygon(3,71,0,0,255);
    }

}


        //bob.moveto(0,0);
        //bob.polygon(4,50000,1,1,1);
        //for (int x=500;x>0;x=x-10){
        //    bob.moveto(0,0);
//
//            bob.polygon(rand.nextInt(5)+3,x,rand.nextInt(255)+1,rand.nextInt(255)+1,rand.nextInt(255)+1);

        //}
