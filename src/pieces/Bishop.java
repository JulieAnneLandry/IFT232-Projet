package pieces;

import java.util.ArrayList;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import chess.P;

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

    @Override
    public void setOptions() {
        options = new ArrayList<Point>();
        Point coor = myCase.getPoint();
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
        return 'F';
    }
}
