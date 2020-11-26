package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        Player player7 = new Player();
        Player player8 = new Player();
        System.out.println(player1.getCountPlayers());
        Player.info();
        int player1MaxStamina = player1.getStamina();
        for(int i=0; i<player1MaxStamina;i++){
            player1.run(player1);
        }
        System.out.println(player1.getCountPlayers());
        Player.info();
    }
}
class Player{
        private int Stamina;
        private static int countPlayers;
        public static final int MAX_STAMINA = 100;
        public static final int MIN_STAMINA = 0;
        public Player(){
            this.Stamina = (int)(Math.random() *11+90);
            if(countPlayers<6) {
                countPlayers++;
            }
        }
        public int getCountPlayers() {
            return countPlayers;
        }
        public int getStamina(){
         return Stamina;

        }
        public void run(Player player1){
            if (player1.Stamina==0){
                System.out.println("Этот игрок устал и уже ушел с поля");
            } else {
                player1.Stamina--;
                if (player1.Stamina == 0) {
                    countPlayers--;
                }
            }
        }
        public static void info(){
            if(countPlayers>=6) {
                System.out.println("На поле нет свободных мест");
            } else if(countPlayers==5) {
                System.out.println("Команды неполные. На поле есть 1 свободное место");
            }
            else if (countPlayers == 1) {
                System.out.println("Команды неполные. На поле есть 5 свободных мест");
            } else{
                System.out.println("Команды неполные. На поле есть "+countPlayers+" свободных места");
            }
        }
    }
    /*
    Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player ),
содержит следующие поля:
- поле “выносливость” (англ. stamina ), разное для каждого экземпляра
- константы “максимальная выносливость” (англ. MAX_STAMINA ) со значением
100 и “минимальная выносливость” (англ. MIN_STAMINA ) со значением 0,
единые для всех экземпляров
- статическое поле countPlayers , которое считает количество игроков на
футбольном поле (изначально их 0, выходом на поле считается создание
экземпляра класса, уходом - когда игрок устал).
- геттер для поля “выносливость”
и следующие методы:
run() - Игрок бежит при вызове этого метода. Этот метод уменьшает выносливость
на 1 при однократном вызове. Когда выносливость достигает 0, игроку нужен отдых и
он уходит с поля.
info() - выводит сообщение в зависимости от количества игроков на поле. Если
игроков меньше 6, то выводит сообщение: “Команды неполные. На поле еще есть ...
свободных мест”, иначе: “На поле нет свободных мест”. Грамматикой русского языка
пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
Задание: Создать класс Player по вышеописанному шаблону. Экземпляр класса при
создании должен иметь значение выносливости от 90 до 100 (генерировать внутри
конструктора). Создать 6 игроков, вызвать метод info() . При попытке создать 7,8 …
n игрока, количество игроков на поле меняться не должно, проверить это.
Примените к игроку метод run() , пока он полностью не выдохнется (отрицательное
значение выносливости не допускается). Вывести количество игроков на поле.
*По желанию: доработать метод info() так, чтобы при выводе в консоль грамматика
русского языка учитывалась.
     */

