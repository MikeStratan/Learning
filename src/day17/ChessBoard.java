package day17;

public class ChessBoard {
    String[][] chessBoardScheme;

    public ChessBoard(String[][] chessBoardScheme) {
        this.chessBoardScheme = chessBoardScheme;
    }

    public void print(){
        for (String[] strings : this.chessBoardScheme) {
            StringBuilder chessBoardLine = new StringBuilder();
            for (String string : strings) {
                chessBoardLine.append(string);
            }
            System.out.println(chessBoardLine);
        }
    }
}
/*
Затем создайте класс Шахматная доска (англ. ChessBoard ). Этот класс в
единственном аргументе конструктора должен принимать на вход двумерный массив
шахматных фигур. Этот двумерный массив задает конфигурацию фигур на шахматной
доске. Пустое пространство на шахматной доске задается с помощью значения
EMPTY . Также, у класса ChessBoard должен быть реализован метод print() ,
который выводит шахматную доску в консоль.
В методе main() класса Task2 создайте новый объект класса ChessBoard , передав
ему в качестве аргумента двумерный массив с расположением фигур как на картинке
ниже (матч Крамник - Каспаров 2000 года).
Затем, используя метод print() выведите шахматную доску в консоль, используя
строковые обозначения шахматных фигур.
 */