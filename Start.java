package start;

import javax.swing.SwingUtilities;

import view.BallFrame;

public class Start {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable( ) {
			
			public void run ()
			{
				new BallFrame();
			}
		});

	}

}
