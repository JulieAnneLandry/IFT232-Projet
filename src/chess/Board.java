package chess;

import java.awt.*;
import javax.swing.*;

import pieces.*;

public class Board extends JPanel {

	private static final long serialVersionUID = 1L;
	protected Case[][] cases;

	public Board() {
		setSize(800, 700);
		setLayout(new GridLayout(8, 8));
		cases = new Case[8][8];
		createCases();

		initPieces();
	}

	public Board(int h, int w) {
		setSize(h, w);
		setLayout(new GridLayout(8, 8));
		cases = new Case[8][8];
		createCases();

		initPieces();
	}

	public void initPieces() {

		initTeam(true, 0, 1);
		initTeam(false, 7, 6);

	}

	public void addPiece(Piece p, int x, int y) {

		cases[x][y].setPiece(p);

	}

	public void initTeam(boolean team, int row, int pawn) {

		for (int i = 0; i < 8; i++) {
			addPiece(new Pawn(team), pawn, i);
		}

		addPiece(new Rook(team), row, 0);
		addPiece(new Rook(team), row, 7);

		addPiece(new Knight(team), row, 1);
		addPiece(new Knight(team), row, 6);

		addPiece(new Bishop(team), row, 2);
		addPiece(new Bishop(team), row, 5);

		addPiece(new Queen(team), row, 3);

		addPiece(new King(team), row, 4);
	}

	private void createCases() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Case p = new Case(i, j);
				add(p);
				cases[i][j] = p;
			}
		}
	}

	public void afficherTout() {
		paintAll(getGraphics());
	}

}