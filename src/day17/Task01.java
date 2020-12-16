package day17;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        List<ChessPiece> chessPieses = new ArrayList<>();
        chessPieses.add(ChessPiece.PAWN_WHITE);
        chessPieses.add(ChessPiece.PAWN_WHITE);
        chessPieses.add(ChessPiece.PAWN_WHITE);
        chessPieses.add(ChessPiece.PAWN_WHITE);
        chessPieses.add(ChessPiece.ROCK_BLACK);
        chessPieses.add(ChessPiece.ROCK_BLACK);
        chessPieses.add(ChessPiece.ROCK_BLACK);
        chessPieses.add(ChessPiece.ROCK_BLACK);
        for(ChessPiece chessPiece: chessPieses){
            System.out.print(chessPiece);
        }
    }
}
