package chess;

import java.io.BufferedOutputStream;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.util.ArrayList;

import pieces.Piece;

public class SaveToFile extends Save
{

    @Override
    public void save(Board grille)
    {
/*Sauvegarde */
        
        ObjectOutputStream ostream=null;
        ArrayList<Piece> mespieces=grille.getAllPieces();
        try{
         ostream=new ObjectOutputStream(
                  new BufferedOutputStream(
                   new FileOutputStream(
                    new File("res/savefile.txt"))));
        for(Piece lapiece:mespieces){
            
            ostream.writeObject(lapiece);
            
        }
        ostream.close();
        
        
        }
        catch(FileNotFoundException e){}
        catch(IOException e){}

    }

}
