package day13;

import java.util.List;

public class User {
    private String username;
    private List <User> subscriptions;

    public User(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public String getUsername() {
        return username;
    }

    public void subscribe(User user){
        this.subscriptions.add(user);
    }
    public boolean isSubscribed(User user){
        return this.subscriptions.contains(user);
    }
    public boolean isFriend(User user){
        return user.getSubscriptions().contains(this.username) && this.getSubscriptions().contains(user.username);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
    /*
    Поля:
- Строковое поле “имя пользователя” (англ. username )
- Список, параметризованный классом User , с названием “подписки” (англ.
subscriptions ). В этом списке должны храниться те пользователи, на
которых подписан пользователь.
Конструктор:
Должен принимать в качестве аргумента только имя пользователя. Также, должен
инициализировать поле “подписки” пустым списком.
Методы:
- Геттеры на все поля
- public void subscribe(User user) - подписывает пользователя на
пользователя user
- public boolean isSubscribed(User user) - возвращает True , если
пользователь подписан на пользователя user и False , если не подписан.

public boolean isFriend(User user) - возвращает True , если
пользователь user является другом и False , если пользователь user не
является другом. Подумайте, что такое дружба в контексте соц. сетей.
- public void sendMessage(User user, String text) - отправляет
сообщение с текстом text пользователю user . Здесь должен использоваться
статический метод из MessageDatabase .
- public String toString() - возвращает строковое представление
пользователя (имя пользователя).
     */
}
