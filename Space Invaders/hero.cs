using System;
using System.Drawing;
using System.Drawing.Drawing2D;

	namespace CSGame{
		class Hero{
			//variables
			public int x,y, xR, yB;// Note: set variables to "public"(inaccessible due to protection) 
				int dx; //Color c;
				//Point[] points;
				//LinearGradientBrush b;
				Setting game;
				Image h;
			//Constructor
			public Hero(Setting game,int x, int y,int dx, Color c){
				 this.game = game;
				 this.x = x;
				 this.y = y;
				 this.xR = x+80;
				 this.yB = y+80;
				 this.dx = dx;
				 //this.c = c;
				 y = 450;
				 //points = new Point[3];
				 //b = new LinearGradientBrush(new Point(80, 80), new Point(0, 0), c, Color.Red); 
				 h = Image.FromFile("images\\ship.gif");
				 }
			public void draw(){
				//points[0] = new Point(x + 40,y + 0);
				//points[1] = new Point(x + 0,y + 80);
				//points[2] = new Point(x + 80,y +80);
				//game.canvas.FillPolygon(b,points);
				game.canvas.DrawImage(h, x, y);
			} 
			public void moveLeft(){
				if(x > -40){
					x -= dx; }
			} 
			public void moveRight(){ 
				if(x < game.width - 60){
					x += dx;
				}
			} 
		}
	}