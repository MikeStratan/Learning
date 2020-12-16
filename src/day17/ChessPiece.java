package day17;

public enum ChessPiece {
    KING_WHITE(100,"♔"),
    KING_BLACK(100, "♚"),
    QUEEN_WHITE(9,"♕"),
    QUEEN_BLACK(9, "♛"),
    BISHOP_WHITE(3.5, "♗"),
    BISHOP_BLACK(3.5,"♝"),
    ROCK_WHITE(5, "♖"),
    ROCK_BLACK(5, "♜"),
    KNIGHT_WHITE(3, "♘"),
    KNIGHT_BLACK(3,"♞"),
    PAWN_WHITE(1,"♙"),
    PAWN_BLACK(1, "♟"),
    EMPTY(-1, "_");

    private double value;
    private String chessPieceImage;


    ChessPiece(double value, String chessPieceImage) {
        this.value = value;
        this.chessPieceImage = chessPieceImage;
    }
    public String getChessPieceImage() {
        return chessPieceImage;
    }
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getChessPieceImage() + " ";
    }
}
/*
Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ.
queen), ладья (англ. rook), слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).
В нашей программе, у каждой шахматной фигуры есть следующие характеристики:
● Ценность фигуры - вещественное число
● Строковое обозначение фигуры
В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных. Названия
фигур в перечислении должны иметь следующий вид:
KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее
У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое
обозначение.
Ценности шахматных фигур приведены в таблице:
Пешка 1
Конь 3
Слон 3.5
Ладья 5
Ферзь 9
Король 100
Строковые обозначения шахматных фигур приведены в таблице:
Пешка (белая) ♙
Конь (белый) ♘
Слон (белый) ♗
Ладья (белая) ♖
Ферзь (белый) ♕
Король (белый) ♔
Пешка (черная) ♟
СКАЧАНО С WWW.SW.HELP - ПРИСОЕДИНЯЙСЯ!
Конь (черный) ♞
Слон (черный) ♝
Ладья (черная) ♜
Ферзь (черный) ♛
Король (черный) ♚
Используя созданный enum, в методе main() класса Task1 создайте массив,
содержащий 4 белых пешки и 4 черных ладьи. Выведите содержимое этого массива
на экран, используя строковые обозначения шахматных фигур.
 */
