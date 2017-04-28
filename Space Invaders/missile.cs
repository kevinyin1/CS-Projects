 using System;
using System.Drawing;
using System.Drawing.Drawing2D;

	namespace CSGame{
		class Missile{
			 //variables
			 public int x,y,dy;
			 public bool fired; // tracks missile status
			 //Point[] points;
			 //SolidBrush b;
			 Setting game;
			Image m;
		//Constructor
		public Missile(Setting game, int dy){
			 this.game = game;
			 this.dy = dy;
			 this.fired = false;
			 //points = new Point[3];
			 //b = new SolidBrush(Color.Orange); 
			 m = Image.FromFile("images\\missile.gif");
			 }
		public void draw(){
			 //points[0] = new Point(x + 40,y + 5);
			// points[1] = new Point(x + 20,y + 30);
			 //points[2] = new Point(x + 60,y + 30);
			 //game.canvas.FillPolygon(b,points);//missile top
			 //game.canvas.FillRectangle(new SolidBrush(Color.Red),x+30, y+30, 20, 30);//missile bottom
			 game.canvas.DrawImage(m,x+30,y+30);
			 } 
		public void move(int x, int y){
			 this.x = x;
			 this.y = y; 
			 fired = true;
			 } 
		public void shoot(){
			 // display missile and move it only if 'fired'
			 if(fired){
			 y -= dy;
			 draw();
			} 
		} 
	}
 }