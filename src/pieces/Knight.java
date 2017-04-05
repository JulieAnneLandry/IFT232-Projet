package pieces;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Knight extends Piece {

	private static final Icon KNIGHT_GOLD = new ImageIcon("res/cavalierDore.png");
	private static final Icon KNIGHT_WHITE = new ImageIcon("res/cavalierBlanc.png");

	public Knight(boolean team) {
		if (team) {
			img = KNIGHT_GOLD;
		} else {
			img = KNIGHT_WHITE;
		}
	}

	@Override
	public void setOptions() {

	}

}
