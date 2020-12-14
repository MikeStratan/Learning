package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Билли");
        User user2 = new User("Вилли");
        User user3 = new User("Дилли");

        user1.sendMessage(user2, "Привет, Вилли");
        user1.sendMessage(user2, "Пойдешь в бар?");
        user2.sendMessage(user1, "Здарова");
        user2.sendMessage(user1, "Не, сегодня пас");
        user2.sendMessage(user1, "И так уже печень болит");
        user3.sendMessage(user1, "Вилли, салют");
        user3.sendMessage(user1, "А ну пошли с нами в бар, негодяй");
        user3.sendMessage(user1, "Завтра мы моложе все равно не будем");
        user1.sendMessage(user3, "Так, алкаши, хорош меня зазывать!");
        user1.sendMessage(user3, "Хотя, дайте подумать...");
        user1.sendMessage(user3, "Ладно, погнали");
        user3.sendMessage(user1, "Молорик) тогда в семь на Маяковке");

        MessageDatabase.showDialog(user1, user3);
    }
}
/*
В методе main() этого класса необходимо создать трех пользователей.
Затем необходимо:
- Отправить 2 сообщения от пользователя 1 пользователю 2
- Отправить 3 сообщения от пользователя 2 пользователю 1
- Отправить 3 сообщения от пользователя 3 пользователю 1
- Отправить 3 сообщения от пользователя 1 пользователю 3
- Отправить 1 сообщение от пользователя 3 пользователю 1
Сообщения могут быть любыми.
После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью
метода showDialog() .
 */