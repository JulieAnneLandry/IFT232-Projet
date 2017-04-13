package pieces;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Bishop extends Piece {

    private static final long serialVersionUID = 1L;
    private static final Icon BISHOP_GOLD = new ImageIcon("res/fouDore.png");
	private static final Icon BISHOP_WHITE = new ImageIcon("res/fouBlanc.png");

	
	public Bishop(boolean t) {
		if (t) {
			img = BISHOP_GOLD;
		} else {
			img = BISHOP_WHITE;
		}
		
		team = t;
	}

	/*@Override
	public void setOptions() {
		// TODO Auto-generated method stub

	}*/

    

    @Override
    public char pieceKey()
    {
        return 'F';
    }
}
