package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import game.StoreageArea;
import graphics.GamePanel;

public class GStoreageArea extends Drawable{
	
	private StoreageArea area;
	
	@Override
	public void Draw(Graphics g) {
		if(g!=null)
		{
		BufferedImage img = View.images.get("sArea");
		
		g.drawImage(img, View.blockSize*area.getPos().getX(),  View.blockSize*area.getPos().getY(), null);		
		}
	}
	
	public void setStorageArea(StoreageArea area) {
		this.area = area;
	}
}
