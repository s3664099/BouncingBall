package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ButtonBar extends JPanel {
	
	BallPanel panel;
	JButton start;
	PressStart startBall = new PressStart();
	PressStop stopBall = new PressStop();
		
	public ButtonBar(BallPanel panel)
	{
		this.panel = panel;
		
		start = new JButton("Start");
		start.addActionListener(startBall);
		
		//JButton stop = new JButton("Stop");
		//stop.addActionListener(new PressStop());
		
		JButton speedUp = new JButton("Speed Up");
		speedUp.addActionListener(new SpeedUp());
		
		JButton slowDown = new JButton("Slow Down");
		slowDown.addActionListener(new SlowDown());
		
		JButton inflate = new JButton("Inflate");
		inflate.addActionListener(new Inflate());
		
		JButton deflate = new JButton("Deflate");
		deflate.addActionListener(new Deflate());
		
		JButton vertical = new JButton("Vertical Move");
		vertical.addActionListener(new Vertical());
		
		JButton horizontal = new JButton("Horizontal Move");
		horizontal.addActionListener(new Horizontal());
		

		add(speedUp);
		add(inflate);
		add(vertical);
		add(start);
		add(horizontal);
		add(deflate);
		add(slowDown);
	}
	
	class PressStart implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.startMove();
			setStop();
		}
		
	}
	
	public void setStop()
	{
		start.setText("Stop");
		start.removeActionListener(startBall);
		start.addActionListener(stopBall);
	}
	
	class PressStop implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.stopMove();
			start.setText("Start");
			start.removeActionListener(stopBall);
			start.addActionListener(startBall);
			
		}
		
	}
	
	class Horizontal implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.moveHorizontal();
			setStop();
			
		}
		
	}
	
	class Vertical implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.moveVertical();
			setStop();
			
		}
		
	}
	
	class SpeedUp implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.speedUp();
			setStop();
			
		}
		
	}
	
	class SlowDown implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.slowDown();
			
		}
		
	}
	
	class Inflate implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.inflate();;
			
		}
		
	}
	
	class Deflate implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel.deflate();;
			
		}
		
	}

}
