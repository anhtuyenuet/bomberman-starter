package uet.oop.bomberman.gui;

import uet.oop.bomberman.Game;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Swing Panel hiển thị thông tin thời gian, điểm mà người chơi đạt được
 */
public class InfoPanel extends JPanel {
	
	private JLabel timeLabel;
	private JLabel pointsLabel;
        private JLabel high;

	public InfoPanel(Game game) throws IOException {
		setLayout(new GridLayout());
		
		timeLabel = new JLabel("Time: " + game.getBoard().getTime());
		timeLabel.setForeground(Color.white);
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		
		pointsLabel = new JLabel("Points: " + game.getBoard().getPoints());
		pointsLabel.setForeground(Color.white);
                pointsLabel.setHorizontalAlignment(JLabel.CENTER);
                
                high = new JLabel("High: " + game.getBoard().getHigh());
		high.setForeground(Color.white);
		high.setHorizontalAlignment(JLabel.CENTER);
                
		add(timeLabel);
		add(pointsLabel);
                add(high);
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(0, 40));
	}
	
	public void setTime(int t) {
		timeLabel.setText("Time: " + t);
	}

	public void setPoints(int t) {
		pointsLabel.setText("Score: " + t);
	}
        
        public void setHigh(int t) {
            high.setText("High: " + t);
        }
	
}
