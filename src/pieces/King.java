package pieces;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class King extends Piece {

	private static final Icon KING_GOLD = new ImageIcon("res/roiDore.png");
	private static final Icon KING_WHITE = new ImageIcon("res/roiBlanc.png");

	public King(boolean team) {
		if (team) {
			img = KING_GOLD;
		} else {
			img = KING_WHITE;
		}
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}
}
