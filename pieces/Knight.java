package pieces;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Knight extends Piece
{

    private static Point[] pointsDep = { new Point(1, 2), new Point(1, -2), new Point(2, 1), new Point(2, -1),
            new Point(-1, 2), new Point(-1, -2), new Point(-2, 1), new Point(-2, -1) };
    private static final long serialVersionUID = 1L;
    private static final Icon KNIGHT_GOLD = new ImageIcon("res/cavalierDore.png");
    private static final Icon KNIGHT_WHITE = new ImageIcon("res/cavalierBlanc.png");

    public Knight(boolean team)
    {
        if (team)
        {
            img = KNIGHT_GOLD;
        }
        else
        {
            img = KNIGHT_WHITE;
        }
    }

    @Override
    public void setOptions()
    {
        options = new ArrayList<Point>();
        Point coor = myCase.getPoint();
        Point opt;
        
        for (Point p : pointsDep)
        {
            opt = new Point(coor.x + p.x, coor.y + p.y);
            
            if (!outOfBounds(opt))
            {
                options.add(opt);
            }
        }

    }

    @Override
    public char pieceKey()
    {
        return 'C';
    }

}
