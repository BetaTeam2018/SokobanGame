package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import game.Floor;
import game.Friction;
import graphics.GamePanel;

public class GFloor extends Drawable{
	
	private Floor floor;
	
	@Override
	public void Draw(Graphics g) {
		if(g!=null)
		{
		BufferedImage img; 		
		
		if(floor.getFriction() == Friction.NORMAL)
			img = View.images.get("floor");
		else if(floor.getFriction() == Friction.OIL)
			img = View.images.get("oFloor");
		else
			img = View.images.get("hFloor");
	
		g.drawImage(img, View.blockSize*floor.getPos().getX(),  View.blockSize*floor.getPos().getY(), null);
		}
	}
	
	public void setFloor(Floor floor) {
		this.floor = floor;
	}

}
