package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import game.TrapDoor;
import graphics.GamePanel;

public class GTrapDoor extends Drawable{
	
	private TrapDoor trap;
	
	@Override
	public void Draw(Graphics g) {
		if(g!=null)
		{
		BufferedImage img;
		if(trap.getState())
			img = View.images.get("hole"); //ha nyitva van akkor holenak néz ki
		else
			img = View.images.get("trap"); //egyébként
		
		g.drawImage(img, View.blockSize*trap.getPos().getX(),  View.blockSize*trap.getPos().getY(), null);		
		}
	}
	
	public void setTrapDoor(TrapDoor trap) {
		this.trap = trap;
	}

}