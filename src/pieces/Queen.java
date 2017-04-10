package pieces;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Queen extends Piece {

    private static final long serialVersionUID = 1L;
    private static final Icon QUEEN_GOLD = new ImageIcon("res/reineDore.png");
	private static final Icon QUEEN_WHITE = new ImageIcon("res/reineBlanc.png");

	public Queen(boolean team) {
		if (team) {
			img = QUEEN_GOLD;
		} else {
			img = QUEEN_WHITE;
		}
	}

	/*@Override
	public void setOptions() {
		// TODO Auto-generated method stub

	}*/

    

    @Override
    public char pieceKey()
    {
        return 'D';
    }
}
