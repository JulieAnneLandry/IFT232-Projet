package jeuechec;

import java.awt.Point;
import java.awt.event.*;

import javax.swing.*;

public class Carre extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	private Point pXY;
	private static boolean enDeplacement = false;
	private static Piece pieceEnDeplacement;

	public Carre() {
		super();
		addMouseListener(this);
	}

	// Constructeur de carre avec identificateur
	public Carre(int x, int y) {
		super();
		setName((x + 1) + "," + (y + 1));
		pXY = new Point(x, y);
		addMouseListener(this);
	}

	public void afficherPiece() {
		update(getGraphics());
	}

	public void mouseClicked(MouseEvent e) {
		if (enDeplacement) {
			add(pieceEnDeplacement);
			System.out.println("Case: " + getComponent(0));
			afficherPiece();
			enDeplacement = false;
		} else {
			if (getComponent(0) != null) {
				pieceEnDeplacement = (Piece) getComponent(0);
				// pieceEnDeplacement = new Piece(getComponent(0).getName());
				System.out.println("Case: " + getComponent(0));
				remove(0);
				afficherPiece();
				enDeplacement = true;
			}
		}

		/*
		 * System.out.println("Case: " + getComponent(0)); /* Component[] ac =
		 * getComponents(); for (Component component : ac) { System.out.println(
		 * "Case: " + component); }
		 */

	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	// Lorsque la souris entre sur la case
	public void mouseEntered(MouseEvent e) {
		// System.out.println("Case: " + getName()); // Pour tester le systeme
		// de coordonnees, code jetable
	}

	public void mouseExited(MouseEvent e) {
	}

}
