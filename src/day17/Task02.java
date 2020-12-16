package day17;

public class Task02 {
    public static void main(String[] args) {
        String[][] scheme = {
                {ChessPiece.ROCK_BLACK.getChessPieceImage(), ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(), ChessPiece.ROCK_BLACK.getChessPieceImage(),ChessPiece.QUEEN_BLACK.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage()},
                {ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.ROCK_WHITE.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.PAWN_BLACK.getChessPieceImage(),ChessPiece.PAWN_BLACK.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.PAWN_BLACK.getChessPieceImage()},
                {ChessPiece.PAWN_BLACK.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.KNIGHT_BLACK.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.PAWN_BLACK.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage()},
                {ChessPiece.QUEEN_BLACK.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.BISHOP_WHITE.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage()},
                {ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.BISHOP_BLACK.getChessPieceImage(),ChessPiece.PAWN_WHITE.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage()},
                {ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.BISHOP_WHITE.getChessPieceImage(),ChessPiece.PAWN_WHITE.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage()},
                {ChessPiece.PAWN_WHITE.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.QUEEN_WHITE.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.PAWN_WHITE.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.PAWN_WHITE.getChessPieceImage()},
                {ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage(),ChessPiece.ROCK_WHITE.getChessPieceImage(),ChessPiece.KING_WHITE.getChessPieceImage(),ChessPiece.EMPTY.getChessPieceImage()}
        };
        ChessBoard chessBoard = new ChessBoard(scheme);
        chessBoard.print();

    }
}
/*
В методе main() класса Task2 создайте новый объект класса ChessBoard , передав
ему в качестве аргумента двумерный массив с расположением фигур как на картинке
ниже (матч Крамник - Каспаров 2000 года).
Затем, используя метод print() выведите шахматную доску в консоль, используя
строковые обозначения шахматных фигур.
 */