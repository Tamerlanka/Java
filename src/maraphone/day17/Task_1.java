package maraphone.day17;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
    ChessPiece[] pieses ={
            ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
            ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK
            };
        for (ChessPiece piese: pieses) {
            System.out.println(piese.getRepresentation());
        }
    }
}
