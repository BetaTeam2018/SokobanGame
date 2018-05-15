package graphics;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import view.View;

public class GamePanel extends JPanel{
	private static final long serialVersionUID = 1L;
	public View view;
	@Override
	public void paintComponent(Graphics g)
	{
		view.update();
	}
	}

