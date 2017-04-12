package chess;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.ArrayList;

import pieces.Piece;

public class SavePosition extends Save
{

    @Override
    public void save(Board grille)
    {
/*Sauvegarde */
        ArrayList<Piece> mespieces=grille.getAllPieces();
 
        
        //Transfert de positions
        DataOutputStream out=null;
        try{
         out=new DataOutputStream(
                  new BufferedOutputStream(
                   new FileOutputStream(
                    new File("res/positionfile.txt"))));
        for(Piece lapiece:mespieces){
            char equipe=lapiece.getTeam();
            char key=lapiece.pieceKey();
            int x=lapiece.getCase().getPoint().x;
            int y=lapiece.getCase().getPoint().y;
            
            out.writeChar(equipe);
            out.writeChar(key);
            out.writeInt(x);
            out.writeChar(',');
            out.writeInt(y);
            out.writeChar('\n');
         
            
        }
        out.close();
        
        }
        catch(FileNotFoundException e){}
        catch(IOException e){}

    }


}
