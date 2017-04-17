package chess;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;

public class LoadFromPosition extends Load {

	@Override
	public ArrayList<Piece> load() {
        ArrayList<Piece> mespieces= new ArrayList<Piece>();
    
        try {
			BufferedReader br = new BufferedReader(new FileReader(new File("res/savePosition.txt")));
			
			String line = null;
			
			try {
				
				char t, key, charX, charY;
				boolean team = true;
				Piece piece = null;
				Case c;
				
				while ((line = br.readLine()) != null)
				{
					/*
					 * 0 = Equipe
					 * 1 = Key
					 * 2 = x
					 * 3 = ,
					 * 4 = y
					 */
					
					t = line.charAt(0);
					if (t == 'b')
						team = false;
					else
						team = true;
					key = line.charAt(1);
					charX = line.charAt(2);
					charY = line.charAt(4);
					int x = Character.getNumericValue(charX);
					int y = Character.getNumericValue(charY);
					
					c = new Case(x, y);
					
					switch(key)
					{
					case 'P':
						piece = new Pawn(team);
						break;
					case 'C':
						piece = new Knight(team);
						break;
					case 'T':
						piece = new Rook(team);
						break;
					case 'F':
						piece = new Bishop(team);
						break;
					case 'D':
						piece = new Queen(team);
						break;
					case 'R':
						piece = new King(team);
						break;
					}
					
					c.setPiece(piece);
					mespieces.add(piece);
				}
			} catch (IOException e) {
				P.p("Merci bonsoir");
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			P.p("T'AS MAL LOADÉ DUDE !");
			e.printStackTrace();
		}
        
        return mespieces;
	}

}
