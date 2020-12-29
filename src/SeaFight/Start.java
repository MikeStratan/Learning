package SeaFight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;

import static java.lang.StrictMath.abs;


public class Start {
    public static void main(String[] args) {
        String[][] board1 = createEmptyBoard();
        String[][] board2 = createEmptyBoard();
        List<Ship> ships1 = new ArrayList<>();
        List<Ship> ships2 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Начнем расставлять корабли на поле Player1. Другой игрок, не смотри!");
        createBoardShips(board1, ships1);
        System.out.println("Для создания поля игрока2 и скрытия текущего поля нажмите на корзину для очистки консоли, а затем Enter");
        scanner.nextLine();
        System.out.println("Начнем расставлять корабли на поле Player2. Другой игрок, не смотри!");
        createBoardShips(board2, ships2);
        System.out.println("Для начала игры нажмите на корзину для очистки консоли, а затем Enter");
        scanner.nextLine();

        int sequence = (int) (Math.random()+1);
        boolean gameIn = true;
        String shotResult;
        while(gameIn) {
            if (sequence == 1) {
                shotResult = shot(ships1, sequence);
                if(shotResult.equals("No")){
                    sequence = 2;
                }
            }
            else {
                shotResult = shot(ships2, sequence);
                if(shotResult.equals("No")){
                    sequence = 1;
                }
            }
            if(shotResult.equals("End")){
                gameIn = false;
            }
        }
        System.out.println("Игра окончена, победил Игрок"+sequence);
    }

    public static String[][] createEmptyBoard() {
        return new String[][]{
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"},
                {"⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜", "⬜"}
        };
    }

    public static void createBoardShips(String[][] board, List<Ship> ships) {
        createShip("Введите координаты четырехпалубного корабля (формат: x,y)", board, ships, 4);
        createShip("Введите координаты первого трехпалубного корабля (формат: x,y;x,y;x,y;x,y)", board, ships, 3);
        createShip("Введите координаты второго трехпалубного корабля (формат: x,y;x,y;x,y)", board, ships, 3);
        createShip("Введите координаты первого двухпалубного корабля (формат: x,y;x,y)", board, ships, 2);
        createShip("Введите координаты второго двухпалубного корабля (формат: x,y;x,y)", board, ships,  2);
        createShip("Введите координаты третьего двухпалубного корабля (формат: x,y;x,y)", board, ships,  2);
        createShip("Введите координаты первого однопалубного корабля (формат: x,y)", board, ships,  1);
        createShip("Введите координаты второго однопалубного корабля (формат: x,y)", board, ships,  1);
        createShip("Введите координаты третьего однопалубного корабля (формат: x,y)", board, ships,  1);
        createShip("Введите координаты четвертого однопалубного корабля (формат: x,y)", board, ships,  1);
        printBoard(board);
    }

    public static void createShip(String text, String[][] board, List<Ship> ships, int size) {
        try {
            System.out.println(text);
            Scanner scanner = new Scanner(System.in);
            String locationShip = scanner.nextLine();
            int k = 0;
            int x;
            int y;
            String[] locationFieldArr = locationShip.split(";");
            if (locationFieldArr.length != size) {
                throw new DataFormatException("Некорректное количество координат у создаваемого корабля");
            }
            String[][] locationArray = new String[locationFieldArr.length][];
            for (String locationField : locationFieldArr) {
                locationArray[k] = locationField.split(",");
                k++;
            }
            for (String[] locationFieldArray : locationArray) {
                x = Integer.parseInt(locationFieldArray[0]);
                y = Integer.parseInt(locationFieldArray[1]);
                if (locationFieldArray.length != 2) {
                    throw new DataFormatException("Некорректная размерность координат создаваемого корабля");
                }
                if (x > 9 || x < 0 || y > 9 || y < 0) {
                    throw new DataFormatException("Введенные координаты должны быть в диапазоне от 0 до 9.");
                }
                if (board[x][y].equals("\uD83D\uDEE5") || board[x][y].equals("\uD83D\uDFE6")) {
                    throw new DataFormatException("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть других кораблей (\uD83D\uDEE5)");
                }
            }
            if (locationFieldArr.length > 1) {
                int x1 = Integer.parseInt(locationArray[0][0]);
                int y1 = Integer.parseInt(locationArray[0][1]);
                int x2 = Integer.parseInt(locationArray[1][0]);
                int y2 = Integer.parseInt(locationArray[1][1]);
                if (locationFieldArr.length > 2) {
                    int x3 = Integer.parseInt(locationArray[2][0]);
                    int y3 = Integer.parseInt(locationArray[2][1]);
                    if (locationFieldArr.length > 3) {
                        int x4 = Integer.parseInt(locationArray[3][0]);
                        int y4 = Integer.parseInt(locationArray[3][1]);
                        if (!((x4 - x3 == x3 - x2 && x3 - x2 == x2 - x1 && abs(x2 - x1) == 1 &&
                                y4 == y3 && y3 == y2 && y2 == y1) || (y4 - y3 == y3 - y2 && y3 - y2 == y2 - y1 && abs(y2 - y1) == 1 &&
                                x4 == x3 && x3 == x2 && x2 == x1))) {
                            throw new DataFormatException("Корабль должен быть сплошным");
                        }
                    } else if ((!((x3 - x2 == x2 - x1 && abs(x2 - x1) == 1 &&
                            y3 == y2 && y2 == y1) || (y3 - y2 == y2 - y1 && abs(y2 - y1) == 1 &&
                            x3 == x2 && x2 == x1)))) {
                        throw new DataFormatException("Корабль должен быть сплошным");
                    }
                } else if ((!((abs(x2 - x1) == 1 && y2 == y1) || (abs(y2 - y1) == 1 && x2 == x1)))) {
                    throw new DataFormatException("Корабль должен быть сплошным");
                }
            }
            List<ShipField> shipFields = new ArrayList<>();
            for (String[] locationFieldArray : locationArray) {
                x = Integer.parseInt(locationFieldArray[0]);
                y = Integer.parseInt(locationFieldArray[1]);
                board[x][y] = "\uD83D\uDEE5";
                shipFields.add(new ShipField(x,y));
                if (x < 9 && board[x + 1][y].equals("⬜")) {
                    board[x + 1][y] = "\uD83D\uDFE6";
                }
                if (x < 9 && y < 9 && board[x + 1][y + 1].equals("⬜")) {
                    board[x + 1][y + 1] = "\uD83D\uDFE6";
                }
                if (y < 9 && board[x][y + 1].equals("⬜")) {
                    board[x][y + 1] = "\uD83D\uDFE6";
                }
                if (x > 0 && board[x - 1][y].equals("⬜")) {
                    board[x - 1][y] = "\uD83D\uDFE6";
                }
                if (y > 0 && board[x][y - 1].equals("⬜")) {
                    board[x][y - 1] = "\uD83D\uDFE6";
                }
                if (x > 0 && y > 0 && board[x - 1][y - 1].equals("⬜")) {
                    board[x - 1][y - 1] = "\uD83D\uDFE6";
                }
            }
            ships.add(new Ship(shipFields));
        } catch (
                DataFormatException e) {
            System.out.println(e.toString().substring(35));
            createShip(text, board, ships, size);
        }
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static String shot(List<Ship> ships, int sequence){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Игрок" + sequence + ", произведите выстрел");
            String location = scanner.nextLine();
            if(!Pattern.matches("\\d,\\d", location)) {
                throw new DataFormatException("Введены некорректные координаты");
            }
            String[] locationFieldArr = location.split(",");
            int x = Integer.parseInt(locationFieldArr[0]);
            int y = Integer.parseInt(locationFieldArr[1]);
            String result = "No";
            for (Ship ship : ships) {
                for(ShipField shipField: ship.getShipFields()) {
                    if (shipField.getX()==x&&shipField.getY()==y) {
                        ship.getShipFields().remove(shipField);
                        if (ship.getShipFields().size() == 0) {
                            ships.remove(ship);
                            System.out.println("Утопил!");
                        } else {
                            System.out.println("Попадание!");
                        }
                        if (ships.size() == 0)
                            result = "End";
                        else {
                            result = "Yes";
                        }
                        break;
                    }
                }
                if(!result.equals("No")){
                    break;
                }
            }
            if(result.equals("No")){
                System.out.println("Мимо!");
            }
            return result;
        } catch (
                DataFormatException e) {
            System.out.println(e.toString().substring(35));
            return shot(ships, sequence);
        }
    }
}

class ShipField{
    private final int x;
    private final int y;

    public ShipField(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "ShipField{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Ship{
    private final List<ShipField> shipFields;

    public List<ShipField> getShipFields() {
        return shipFields;
    }

    public Ship(List<ShipField> shipFields) {
        this.shipFields = shipFields;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipFields=" + shipFields +
                '}';
    }
}


