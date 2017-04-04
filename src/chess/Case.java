package chess;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.*;

import javax.swing.*;

import pieces.Piece;

public class Case extends JPanel implements MouseListener {

	private static final long serialVersionUID = 1L;
	private Point pXY;

	// Transition prochaine vers singleton
	private static Piece pieceEnDeplacement;

	// Va disparaitre quand le singleton va etre implemente
	private static boolean enDeplacement = false;

	private JLabel label;
	private Piece piece;

	public Case() {
		super();
		addMouseListener(this);
	}

	// Constructeur de carre avec identificateur
	public Case(int x, int y) {
		super();

		setName((x + 1) + "," + (y + 1));
		pXY = new Point(x, y);
		setColor(x, y);

		label = new JLabel();
		piece = null;
		add(label);

		addMouseListener(this);
	}

	public void setPiece(Piece p) {
		piece = p;
		label.setIcon(p.getImage());
		afficherPiece();
	}

	public void removePiece() {
		piece = null;
		label.setIcon(null);
		afficherPiece();
	}

	public void afficherPiece() {
		update(getGraphics());
	}

	public void mouseClicked(MouseEvent e) {

		if (!enDeplacement) {

			if (piece != null) {
				pieceEnDeplacement = piece;
				removePiece();
				enDeplacement = true;
			} else {
				pieceEnDeplacement = null;
			}

		} else {

			setPiece(pieceEnDeplacement);
			enDeplacement = false;

		}
	}

	// Choisir la couleur du carre en fonction de sa position sur la grille
	private void setColor(int x, int y) {
		if ((x + y) % 2 == 0) {
			setBackground(Color.WHITE);
		} else {
			setBackground(Color.BLACK);
		}
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
