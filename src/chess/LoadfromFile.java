package chess;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

import pieces.Piece;

public class LoadFromFile extends Load
{

    @Override
    public ArrayList<Piece> load()
    {
        boolean eof=false;
        ArrayList<Piece> mespieces= new ArrayList<Piece>();
        try{
        ObjectInputStream istream=null;
        
        
          istream=new ObjectInputStream(
                  new BufferedInputStream(
                   new FileInputStream(
                    new File("res/savefile.txt"))));
          Piece mapiece;
        while(!eof){
            try{
            mapiece=(Piece)istream.readObject();
            mespieces.add(mapiece);
            }catch(EOFException e){
                eof=true;
            } catch(ClassNotFoundException e){}
        }
        istream.close();
        
        }
        catch(FileNotFoundException e){}
        catch(IOException e){}
    return mespieces;
    }

}
