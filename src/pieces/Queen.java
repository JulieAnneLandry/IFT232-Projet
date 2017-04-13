package pieces;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Queen extends Piece {

    private static final long serialVersionUID = 1L;
    private static final Icon QUEEN_GOLD = new ImageIcon("res/reineDore.png");
	private static final Icon QUEEN_WHITE = new ImageIcon("res/reineBlanc.png");

	public Queen(boolean t) {
		if (t) {
			img = QUEEN_GOLD;
		} else {
			img = QUEEN_WHITE;
		}
		
		team = t;
	}

	@Override
	public void setOptions() {

	    options = new ArrayList<Point>();
        Point coor = myCase.getPoint();
        Point ptC;
        Point ptL;
        
        for (int i = 0; i < 8; i++)
        {
            ptC = new Point(coor.x, i);
            ptL = new Point(i, coor.y);
            if (!coor.equals(ptC))
                options.add(ptC);
            if (!coor.equals(ptL))
                options.add(ptL);
        }
        
        Point opt = new Point(coor.x,coor.y);
        Point opt2 = new Point(coor.x,coor.y);
        
        while (opt.x < 8){
            opt = new Point(opt.x + 1, opt.y+1);
            opt2 = new Point(opt2.x + 1, opt2.y-1);
            
            if (!outOfBounds(opt)){
                options.add(opt);
            }
            if (!outOfBounds(opt2)){
                options.add(opt2);
            }
        }
        
        opt = new Point(coor.x,coor.y);
        opt2 = new Point(coor.x,coor.y);
        
        while (opt.x > 0){
            opt = new Point(opt.x - 1, opt.y + 1);
            opt2 = new Point(opt2.x - 1, opt2.y - 1);
            
            if (!outOfBounds(opt)){
                options.add(opt);
            }
            if (!outOfBounds(opt2)){
                options.add(opt2);
            }
        }
	}

    @Override
    public char pieceKey()
    {
        return 'D';
    }
}
