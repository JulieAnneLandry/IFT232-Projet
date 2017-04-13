package chess;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import pieces.Piece;

public class SavePosition extends Save
{

	@Override
	public void save(Board grille)
	{
		/*Sauvegarde */
		ArrayList<Piece> mespieces=grille.getAllPieces();

		try {
			File saveFile = new File("res/savePosition.txt");
			FileOutputStream fout = new FileOutputStream(saveFile);
			PrintStream out = new PrintStream(fout);

			for(Piece lapiece:mespieces)
			{
				char equipe = lapiece.getTeam();
				char key = lapiece.pieceKey();
				int x = lapiece.getCase().getPoint().x;
				int y = lapiece.getCase().getPoint().y;
				
				// Retourne exemple : "nP1,0" pour un pion noir en position (1,0)
				out.println(equipe+""+key+""+x+","+y);
			}
			
			out.close();
		} catch (IOException e) {
			P.p("T'AS MAL SAVÉ DUDE");
			e.printStackTrace();
		}


	}


}
