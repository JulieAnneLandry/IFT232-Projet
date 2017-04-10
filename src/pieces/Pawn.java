package pieces;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Pawn extends Piece {

    private static final long serialVersionUID = 1L;
    private static final Icon PAWN_GOLD = new ImageIcon("res/pionDore.png");
	private static final Icon PAWN_WHITE = new ImageIcon("res/pionBlanc.png");

	public Pawn(boolean t) {
		if (t) {
			img = PAWN_GOLD;
		} else {
			img = PAWN_WHITE;
		}
		
		team = t;
	}

	/*@Override
	public void setOptions() {

	}*/

   

    @Override
    public char pieceKey()
    {
        return 'P';
    }

}
