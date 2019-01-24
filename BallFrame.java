package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BallFrame extends JFrame {
	
	public BallFrame() 
	{
		super("Bouncing Ball");
		
		setLayout(new BorderLayout());
		
		BallPanel panel = new BallPanel();
		
		add(panel, BorderLayout.CENTER);
		add(new ButtonBar(panel), BorderLayout.NORTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setBounds(100,100, 800,600);
		
		setVisible(true);
	}
	

}
