package chess;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import pieces.*;

public class Board extends JPanel {

	private static final long serialVersionUID = 1L;
	protected Case[][] cases;
	private ArrayList<Piece> pieceBox;

	public Board() {
		setSize(800, 700);
		setLayout(new GridLayout(8, 8));
		cases = new Case[8][8];
		createCases();
		pieceBox=new ArrayList<Piece>();
		initPieces();
	}

	public Board(int h, int w) {
		setSize(h, w);
		setLayout(new GridLayout(8, 8));
		cases = new Case[8][8];
		createCases();
		pieceBox=new ArrayList<Piece>();

		initPieces();
	}

	public Board(ArrayList<Piece> pieces) {
		setSize(800, 700);
		setLayout(new GridLayout(8, 8));
		cases = new Case[8][8];
		createCases();
		pieceBox = pieces;
		//initPieces();
		
		initFromFile(pieceBox);
		
		//initFromPosition(pieceBox);
	}
	
	/*
	 * CECI EST DU GARBAGE. À REFAIRE.
	 * Ne pas supprimer. Il s'agit d'une leçon importante à retenir.
	 * Maxime et Julie-Anne
	 * xxx
	 */
	/*private void initFromPosition(ArrayList<Piece> pieces)
	{
		ArrayList<Case> casesBox = new ArrayList<Case>();
		for (Piece p : pieces)
		{
			casesBox.add(p.getCase());
		}
		
		int k = 0;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				Case c = new Case(i, j);
				if (!casesBox.contains(c))
				{
					casesBox.add(c);
				}
				add(casesBox.get(k));
				cases[i][j] = casesBox.get(k);
				
				++k;
			}
		}
	}*/

	private void initFromFile(ArrayList<Piece> pieces) {
		
		for (Piece p : pieces)
		{
			addExistingPieces(p, (int)p.getCase().getPoint().getX(), (int)p.getCase().getPoint().getY());
		}
	}

	private void addExistingPieces(Piece p, int x, int y) {
		cases[x][y].setPiece(p);
	}

	public void initPieces() {

		initTeam(true, 0, 1);
		initTeam(false, 7, 6);

	}

	public void addPiece(Piece p, int x, int y) {

		cases[x][y].setPiece(p);
		pieceBox.add(p);

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
				Case c = new Case(i, j);
				add(c);
				cases[i][j] = c;
			}
		}
	}

	public void afficherTout() {
		paintAll(getGraphics());
	}
	
	public ArrayList<Piece> getAllPieces(){
	   return pieceBox;
	}

}
