package chess;

import java.util.ArrayList;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;

public class Board {

	protected static Case[][] cases = new Case[8][8];
	private ArrayList<Piece> pieceBox;

	public Board() {
		createCases();
		pieceBox = new ArrayList<Piece>();
		initPieces();
	}
	
	public Board(ArrayList<Piece> pieces)
	{
		createCases();
		pieceBox = pieces;
		initFromFile(pieceBox);
	}
	
	public void initFromFile(ArrayList<Piece> pieces)
	{
		for (Piece p : pieces)
		{
			addExistingPieces(p, (int)p.getCase().getPoint().getX(), (int)p.getCase().getPoint().getY());
		}
	}
	
	private void addExistingPieces(Piece p, int x, int y)
	{
		cases[x][y].setPiece(p);
	}

	public static Case getCase(int i, int j) {
		return cases[i][j];
	}

	public ArrayList<Piece> getAllPieces() {
		return pieceBox;
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

		addPiece(new Queen(team), row, 4);

		addPiece(new King(team), row, 3);
	}

	private void createCases() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				cases[i][j] = new Case(j, i);
			}
		}
	}

}
