package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class BallPanel extends JPanel {
	
	int diameter=100;
	int x=0;
	int y=0;
	int delay = 1000/60;
	int STEP = 2;
	int x_move = STEP;
	int y_move = STEP;
	boolean move = false;
	boolean vertical = false;
	boolean horizontal = false;
	
	
	public BallPanel()
	{
		setBackground(Color.YELLOW);
		
		new Timer(delay, new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				
			}
			
		}).start();
	}
	
	public void paintComponent(Graphics e)
	{
		super.paintComponent(e);
		
		if(move || horizontal)
		{
			x_move = (x<0) ? STEP : (x>getWidth()-diameter) ? -STEP : x_move;
			x+=x_move;
		}
		
		if(move || vertical)
		{
			y_move = (y<0) ? STEP : (y>getHeight()-diameter) ? -STEP : y_move;
			y+=y_move;
		}
		
		e.setColor(Color.BLUE);
		e.fillOval(x,y,diameter,diameter);
	}
	
	public void startMove()
	{
		move = true;
		horizontal = false;
		vertical = false;
	}
	
	public void stopMove()
	{
		move = false;
		horizontal = false;
		vertical = false;
	}
	
	public void moveVertical()
	{
		vertical = true;
		horizontal = false;
		move = false;
	}
	
	public void moveHorizontal()
	{
		vertical = false;
		horizontal = true;
		move = false;
	}
	
	public void speedUp()
	{
		delay-=100;
	}
	
	public void slowDown()
	{
		delay+=100;
	}
	
	public void inflate()
	{
		diameter+=10;
	}
	
	public void deflate()
	{
		diameter-=10;
		if (diameter<10)
		{
			diameter=10;
		}
	}
	

}
