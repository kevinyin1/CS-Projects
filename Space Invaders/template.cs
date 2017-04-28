using System;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Collections.Generic;
using System.Windows.Forms;

namespace CSGame{
	class Template2{
		// Modify Line 57 of Game.cs to match the class name above exactly
		Setting game;
		Alien[] aliens = new Alien[8];// creates the array to hold the Alien objects
		Hero h;
		Missile m;
		int score = 0;
		
		Image background; 
		public Template2(Setting game){
			this.game = game;
			//Create multiple Aliens
			for (int pos =0; pos < aliens.Length; pos++){
				aliens[pos] = new Alien(game,pos*90,10,4,80, Color.Brown);
			} 
			//Create Hero and Missile
			h = new Hero(game,400,415,4, Color.Gray);
			m = new Missile(game, 10);   
			//for (int index=1;index>-1;index++){
			background = Image.FromFile("images\\main_converted.gif");
			//if (index==23)index=1;
			//}
		}

		public void update(){
		 game.canvas.DrawImage(background,0,0);
		 //game.canvas.DrawImage(background,0,0);
		 game.canvas.DrawString("Score: " + score, new Font("Arial",20), new SolidBrush(Color.White),5,5);
		 //Invoke Alien functions: move, collision
			for (int pos =0; pos < aliens.Length; pos++){
				aliens[pos].move();
			if (aliens[pos].Collision(m)){
				score +=10;
			}
			
			if(aliens[pos].y + 40 > h.y){
				Console.WriteLine("Game Over");
				Application.Exit();
			
			}
		} 
		//Invoke Hero functions: draw, moveLeft, moveRight
		h.draw();
		if(game.keyDown == "A"){
			h.moveLeft();
		}
		if(game.keyDown == "D"){
			h.moveRight();
		}
		//Invoke Missile functions: shoot, move
		m.shoot(); // Note: shoot() happens outside of the 'if' decision
		if(game.keyDown == "Space"){
			m.move(h.x, h.y);
		} 
    }
  }
}