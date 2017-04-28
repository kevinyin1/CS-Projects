import TurtleGraphics.*;
import java.awt.*;

public class Turtle{
	AbstractPen p;
	int sides;
	double size,dis;


	public Turtle(){
		p = new StandardPen(new SketchPadWindow(500,500));
	}
	public void forward(double dis){
		p.move(dis);

		this.dis = dis;
	}
	public void left(double a){
		p.turn(a);
	}
	public void right(double a){
		p.turn(-a);
	}
	public void polygon(int sides,double size){
		int angle = 360/sides;
		this.sides = sides;
		this.size = size;

		for(int i = 0;i<sides;i++){
			p.move(size);
			p.turn(angle);
		}
	}
	public void penUp(){
		p.up();
	}
	public void moveto(int x,int y){
		p.up();
		p.move(x,y);
		p.down();
	}
	public void penDown(){
		p.down();
	}
	public void setcolor(int r,int g,int b){
		p.setColor(new Color(r,g,b));
    }
	public void polygon(int sides,double size,int r,int g,int b){
		p.setColor(new Color(r,g,b));
		p.setWidth(4);
		for(double x = size;x>0;x--){
			polygon(sides,x);
		}
		p.setWidth(1);

	}

}
