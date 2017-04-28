using System;
using System.Drawing;
using System.Drawing.Drawing2D;

namespace CSGame{
	class Alien{
		//variables
			public int x,y,dx,dy,xR,yB;
			public bool Alive;
			 Color c;
			 Point[] points;
			 LinearGradientBrush b;
			 Setting game;
 
			 //Constructor
			public Alien(Setting game,int x, int y,int dx, int dy, Color c){
				 this.game = game;
				 this.x = x;
				 this.y = y;
				 this.dx = dx;
				 this.dy = dy;
				 this.c = c;
				 this.xR = x+80;
				 this.yB = y+80;
				 Alive = true;
				 points = new Point[3];
				 //LinearGradientBrush can change colors in a gradient fashion
				 // Requires start point, end point, and 2 colors to be provided
				 b = new LinearGradientBrush(new Point(80, 80), new Point(0, 0), c, Color.Blue); 
				 }
			public void draw(){
				points[0] = new Point(x + 40,y + 0);
				points[1] = new Point(x + 0,y + 80);
				points[2] = new Point(x + 80,y +80);
				game.canvas.FillPolygon(b,points);
				 this.xR = x+80;
				 this.yB = y+80;
				 } 
			public bool Collision(Missile m){ 
				 if (Alive && m.fired  && (xR > m.x && x < m.x+40 && y < m.y+40 && yB > m.y )){
					 Console.WriteLine("Hit");
					 Alive = false;
					 m.fired = false;
					 return true;
					 }
				else
				return false;
				 } 
			public void move(){
			 if(Alive){
				x += dx;
			 if(x < 0 || x > game.width-80){
				dx = -dx;
				y += dy;
				}
			 draw();
			}
		}	
	}
}