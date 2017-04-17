package chess;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import pieces.Piece;

public class Case extends JLabel implements MouseListener {

	private static final long serialVersionUID = 1L;
	private Point pXY;
	private Piece piece;

	public Case(int x, int y) {
		pXY = new Point(x, y);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setColor(x, y);
		this.addMouseListener(this);
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece p) {
		piece = p;
		piece.setCase(this);
		setIcon(p.getImage());
	}

	public void removePiece() {
		piece = null;
		setIcon(null);
	}

	public Point getPoint() {
		return pXY;
	}

	public String getPointasString() {
		return "(" + pXY.x + "," + pXY.y + ")";
	}

	// Choisir la couleur du carre en fonction de sa position sur la grille
	private void setColor(int x, int y) {
		if ((x + y) % 2 == 0) {
			setBackground(Color.WHITE);
		} else {
			setBackground(Color.BLACK);
		}
		setOpaque(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		P.p("Clicked here: " + getPoint());

		if (MovingPiece.isEmpty()) {
			MovingPiece.take(this);
		} else {
			MovingPiece.place(this);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
