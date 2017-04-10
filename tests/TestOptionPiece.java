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
    private Piece bishopTest;
    private Piece kingTest;
    private Piece knightTest;
    private Piece pawnTest;
    private Piece queenTest;
    
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
    public void testQueen()
    {
        testList = b.getAllPieces();
        ArrayList<Piece> testList2 = new ArrayList<Piece>();
        
        for(Piece P : testList){
            if(P instanceof Queen){
                P.setOptions();
                testList2.add(P);
            }
        }
        
        testList = testList2;
        
        for (int i=0;i<8;++i){
        	if ((i+3) < 8)
        		verifPoint.add(new Point(i,i+3));
        	if ((7-i) >= 0)
        		verifPoint.add(new Point(7-i,i+3));
        	
        	verifPoint.add(new Point(i,3));
            verifPoint.add(new Point(0,i));
        }
           
        for(Piece P:testList){
            if(P.getCase().getPoint().x==0 && P.getCase().getPoint().y==3){
                queenTest =P;
                
                break;
            }
        }
        boolean testResult=true;
        for(Point p :verifPoint){
            if(!queenTest.getOptions().contains(p)){
                testResult=false;
                break;
            }
        }
        
        for(Point p :queenTest.getOptions()){
            if(!verifPoint.contains(p)){
                testResult=false;
                break;
            }
        }
        assertTrue(testResult);
    }
    
    @Test
    public void testPawn()
    {
        testList = b.getAllPieces();
        ArrayList<Piece> testList2 = new ArrayList<Piece>();
        
        for(Piece P : testList){
            if(P instanceof Pawn){
                P.setOptions();
                testList2.add(P);
            }
        }
        
        testList = testList2;
        
        for (int i=0;i<8;++i){
            verifPoint.add(new Point(i,i+2));
            verifPoint.add(new Point(7-i,i+2));
        }
           
        for(Piece P:testList){
            if(P.getCase().getPoint().x==1 && P.getCase().getPoint().y==0){
                pawnTest =P;
                
                break;
            }
        }
        boolean testResult=true;
        for(Point p :verifPoint){
            if(!pawnTest.getOptions().contains(p)){
                testResult=false;
                break;
            }
        }
        
        for(Point p :pawnTest.getOptions()){
            if(!verifPoint.contains(p)){
                testResult=false;
                break;
            }
        }
        assertTrue(testResult);
    }
    
    @Test
    public void testKnight()
    {
        testList = b.getAllPieces();
        ArrayList<Piece> testList2 = new ArrayList<Piece>();
        
        for(Piece P : testList){
            if(P instanceof Knight){
                P.setOptions();
                testList2.add(P);
            }
        }
        
        testList = testList2;
        
        for (int i=0;i<8;++i){
            verifPoint.add(new Point(i,i+2));
            verifPoint.add(new Point(7-i,i+2));
        }
           
        for(Piece P:testList){
            if(P.getCase().getPoint().x==0 && P.getCase().getPoint().y==1){
                knightTest =P;
                
                break;
            }
        }
        boolean testResult=true;
        for(Point p :verifPoint){
            if(!knightTest.getOptions().contains(p)){
                testResult=false;
                break;
            }
        }
        
        for(Point p :knightTest.getOptions()){
            if(!verifPoint.contains(p)){
                testResult=false;
                break;
            }
        }
        assertTrue(testResult);
    }
    
    @Test
    public void testKing()
    {
        testList = b.getAllPieces();
        ArrayList<Piece> testList2 = new ArrayList<Piece>();
        
        for(Piece P : testList){
            if(P instanceof King){
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
            if(P.getCase().getPoint().x==0 && P.getCase().getPoint().y==4){
                kingTest =P;
                
                break;
            }
        }
        boolean testResult=true;
        for(Point p :verifPoint){
            if(!kingTest.getOptions().contains(p)){
                testResult=false;
                break;
            }
        }
        
        for(Point p :kingTest.getOptions()){
            if(!verifPoint.contains(p)){
                testResult=false;
                break;
            }
        }
        assertTrue(testResult);
    }
    
    @Test
    public void testBishop()
    {
        testList = b.getAllPieces();
        ArrayList<Piece> testList2 = new ArrayList<Piece>();
        
        for(Piece P : testList){
            if(P instanceof Bishop){
                P.setOptions();
                testList2.add(P);
            }
        }
        
        testList = testList2;
        
        for (int i=0;i<8;++i){
        	if ((i+2) < 8)
        		verifPoint.add(new Point(i,i+2));
        	if ((7-i) >= 0)
        		verifPoint.add(new Point(7-i,i+2));
        }
           
        for(Piece P:testList){
            if(P.getCase().getPoint().x==0 && P.getCase().getPoint().y==2){
                bishopTest =P;
                
                break;
            }
        }
        boolean testResult=true;
        for(Point p :verifPoint){
            if(!bishopTest.getOptions().contains(p)){
                testResult=false;
                break;
            }
        }
        
        for(Point p :bishopTest.getOptions()){
            if(!verifPoint.contains(p)){
                testResult=false;
                break;
            }
        }
        assertTrue(testResult);
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
