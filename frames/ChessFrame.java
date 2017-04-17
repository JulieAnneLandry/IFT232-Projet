package frames;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import chess.Board;
import chess.Load;
import chess.LoadFromFile;
import chess.LoadFromPosition;
import chess.Save;
import chess.SavePosition;
import chess.SaveToFile;
import pieces.Piece;

public class ChessFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private Board board;
	private ChessMenu menu;

	public ChessFrame() {

		ArrayList<Piece> pieces;
		Load l = new LoadFromPosition();
		pieces = l.load();
		
		/*Load l2 = new LoadFromFile();
		pieces = l2.load();*/
		
		board = new Board(pieces);
		menu = new ChessMenu();
		
		/*Save s = new SavePosition();
		s.save(board);*/
		
		/*Save s2 = new SaveToFile();
		s2.save(board);*/

		initComponents();

		setJMenuBar(menu);

		setTitle("Échecs");
		setSize(800, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

	}

	public void initComponents() {

		Container pane = getContentPane();

		pane.setLayout(new GridLayout(1, 1));

		JPanel boardPanel = new JPanel();
		boardPanel.setLayout(new GridLayout(8, 8));

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				boardPanel.add(Board.getCase(i, j));
			}
		}

		pane.add(boardPanel);
	}

}
