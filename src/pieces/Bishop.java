package pieces;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Bishop extends Piece {

	private static final Icon BISHOP_GOLD = new ImageIcon("res/fouDore.png");
	private static final Icon BISHOP_WHITE = new ImageIcon("res/fouBlanc.png");

	
	public Bishop(boolean team) {
		if (team) {
			img = BISHOP_GOLD;
		} else {
			img = BISHOP_WHITE;
		}
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}
}
