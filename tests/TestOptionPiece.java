package tests;

import static org.junit.Assert.*;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chess.Board;
import pieces.Piece;
import pieces.*;

public class TestOptionPiece
{

    private Board b;
    private ArrayList<Piece> testList;
    private ArrayList<Point> verifPoint;
    private Piece rookTest;
    
    @Before   
    public void testOptionPiece(){
        b= new Board();
       verifPoint = new ArrayList<Point>();
    }
    
    @After
    public void testOptionPieceAfter(){
        b = null;
        testList = null;
    }
    
    
    @Test
    public void testRook()
    {
        testList = b.getAllPieces();
        ArrayList<Piece> testList2 = new ArrayList<Piece>();
        
        for(Piece P : testList){
            if(P instanceof Rook){
                P.setOptions();
                testList2.add(P);
            }
        }
        
        testList = testList2;
        
        for (int i=0;i<8;++i){
            verifPoint.add(new Point(i,0));
            verifPoint.add(new Point(0,i));
        }
           
        for(Piece P:testList){
            if(P.getCase().getPoint().x==0 && P.getCase().getPoint().y==0){
                rookTest =P;
            }  
        }
        boolean testResult=true;
        for(Point p :verifPoint){
            if(!rookTest.getOptions().contains(p)){
                testResult=false;
                break;
            }
        }
        
        for(Point p :rookTest.getOptions()){
            if(!verifPoint.contains(p)){
                testResult=false;
                break;
            }
        }
        assertTrue(testResult);
    }

}
